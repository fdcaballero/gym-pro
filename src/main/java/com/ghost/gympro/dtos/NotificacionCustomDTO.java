package com.ghost.gympro.dtos;

import java.util.Map;

public record NotificacionCustomDTO(
        String to,
        String subject,
        String templateName,
        Map<String, Object> variables) {
}
