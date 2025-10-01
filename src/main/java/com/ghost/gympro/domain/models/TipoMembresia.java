package com.ghost.gympro.domain.models;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TipoMembresia {

    private Long id;

    private String nombre;

    private String descripcion;

    private int duracion;

    private BigDecimal costo;
}
