package com.ghost.gympro.domain.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ingreso {
    private Long id;

    private TipoIngreso tipoAcesso;

    private LocalDateTime fecha;

    private Cliente cliente;
}
