package com.ghost.gympro.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record IniciarSesionDTO(@NotEmpty @NotBlank String usuario,
                               @NotEmpty @NotBlank String password) {
}
