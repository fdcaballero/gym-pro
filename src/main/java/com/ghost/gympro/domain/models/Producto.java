package com.ghost.gympro.domain.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Producto {

    private Long id;
    private String descripcion;
    private BigDecimal precio;

}
