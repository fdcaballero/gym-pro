package com.ghost.gympro.dtos;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timestamp,
                           String message,
                           String path,
                           int status) {
}
