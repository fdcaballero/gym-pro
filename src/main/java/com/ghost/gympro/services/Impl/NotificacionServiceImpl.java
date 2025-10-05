package com.ghost.gympro.services.Impl;

import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.services.NotificacionService;

import com.ghost.gympro.utils.MailSendService;
import com.ghost.gympro.utils.NotificacionSimple;
import com.ghost.gympro.utils.SMSSendService;
import com.ghost.gympro.utils.TipoNotificacionEnum;
import org.springframework.stereotype.Service;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    private NotificacionSimple notificationStrategy;
    private MailSendService mailSendService;
    private SMSSendService smsSendService;


    public NotificacionServiceImpl(MailSendService mailSendService, SMSSendService smsSendService) {
        this.mailSendService = mailSendService;
        this.smsSendService = smsSendService;
    }

    @Override
    public void SendNotificacionSimple(NotificacionSimpleDTO request, TipoNotificacionEnum type) {

        if (type.equals(TipoNotificacionEnum.EMAIL)) {
            notificationStrategy = mailSendService;
        } else {
            notificationStrategy = smsSendService;
        }

        notificationStrategy.sendSimpleNotificacion(request);
    }
}
