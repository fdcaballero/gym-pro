package com.ghost.gympro.infraestructura.controllers;


import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.services.NotificacionService;
import com.ghost.gympro.utils.TipoNotificacionEnum;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notificaciones")
public class NotificacionController {

    private final NotificacionService service;

    public NotificacionController(NotificacionService service) {
        this.service = service;
    }


    @PostMapping("/send/")
    public void sendSimpleNotificacion(@RequestBody NotificacionSimpleDTO request,
                                       @RequestParam(value = "mail") TipoNotificacionEnum type) {
        service.SendNotificacionSimple(request,type);
    }
}
