package com.ghost.gympro.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ingreso {
    private Long id;

    private TipoAcceso tipoAcesso;

    private LocalDateTime fecha;

    private Cliente cliente;
}
