package com.ghost.gympro.domain.excepcions;

public class NotificacionException extends RuntimeException {
    private static final String MESSAGE = "Error de notificación";

    public NotificacionException(String message) {
        super("%s - %s".formatted(MESSAGE, message));
    }

    public NotificacionException(String message, Throwable cause) {
        super("%s - %s".formatted(MESSAGE, message), cause);
    }
}
