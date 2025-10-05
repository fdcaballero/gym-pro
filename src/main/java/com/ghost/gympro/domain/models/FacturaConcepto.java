package com.ghost.gympro.domain.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FacturaConcepto {
    private Long id;
    private Concepto concepto;
    private Integer cantidad;
    private BigDecimal subtotal;
    private Factura factura;
}
