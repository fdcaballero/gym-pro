package com.ghost.gympro.utils;

import com.ghost.gympro.configurations.GoogleOAuth2TokenProvider;
import com.ghost.gympro.dtos.NotificacionCustomDTO;
import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.domain.excepcions.NotificacionException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@Service
public class MailSendService implements NotificacionSimple {
    private final JavaMailSenderImpl mailSender;
    private final GoogleOAuth2TokenProvider tokenProvider;
    private final SpringTemplateEngine templateEngine;


    public MailSendService(JavaMailSender mailSender,
                           GoogleOAuth2TokenProvider tokenProvider,
                           SpringTemplateEngine templateEngine) {
        this.mailSender = (JavaMailSenderImpl) mailSender;
        this.tokenProvider = tokenProvider;
        this.templateEngine = templateEngine;
    }

    @Override
    public void sendSimpleNotificacion(NotificacionSimpleDTO request) {
        try {
            String accessToken = tokenProvider.getAccessToken();
            mailSender.setPassword(accessToken);

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(mailSender.getUsername());
            message.setTo(request.to());
            message.setSubject(request.subject());
            message.setText(request.text());
            mailSender.send(message);

        } catch (Exception e) {
            System.err.println("Error al enviar el correo a " + request.to() + ": " + e.getMessage());
            throw new NotificacionException("Fallo en el servicio de correo.", e);
        }
    }


    public void sendCustomNotificacion(NotificacionCustomDTO request) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

            Context context = new Context();
            context.setVariables(request.variables());


            String htmlContent = templateEngine.process(request.templateName(), context);


            helper.setTo(request.to());
            helper.setSubject(request.subject());

            helper.setText(htmlContent, true);

            mailSender.send(mimeMessage);

        } catch (Exception e) {
            System.err.println("Error al enviar el correo con plantilla a " + request.to() + ": " + e.getMessage());
            throw new NotificacionException("Fallo en el servicio de correo con plantilla.", e);
        }
    }
}
