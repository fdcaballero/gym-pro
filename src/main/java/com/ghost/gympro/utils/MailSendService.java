package com.ghost.gympro.utils;

import com.ghost.gympro.dtos.NotificacionCustomDTO;
import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.domain.excepcions.NotificacionException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@Service
@RequiredArgsConstructor
public class MailSendService implements NotificacionSimple {
    private final JavaMailSender mailSender;
    private final SpringTemplateEngine templateEngine;

    @Override
    public void sendSimpleNotificacion(NotificacionSimpleDTO request) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();


            message.setTo(request.to());
            message.setSubject(request.subject());
            message.setText(request.message());

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
