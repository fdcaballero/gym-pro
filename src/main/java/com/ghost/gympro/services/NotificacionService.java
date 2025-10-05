package com.ghost.gympro.services;

import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.utils.TipoNotificacionEnum;

public interface NotificacionService {

    void SendNotificacionSimple(NotificacionSimpleDTO request, TipoNotificacionEnum type);
}
