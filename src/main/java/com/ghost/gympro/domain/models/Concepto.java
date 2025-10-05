package com.ghost.gympro.domain.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Concepto {

    private String descripcion;
    private BigDecimal costo;
}
