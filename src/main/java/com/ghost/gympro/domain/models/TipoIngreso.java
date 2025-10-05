package com.ghost.gympro.domain.models;


import lombok.Data;

@Data
public class TipoIngreso {

    private Long id;

    private String descripcion;

    private Estado estado;
}
