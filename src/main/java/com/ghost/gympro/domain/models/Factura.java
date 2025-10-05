package com.ghost.gympro.domain.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Factura {
    private Long id;
    private String referencia;
    private String descripcion;
    List<FacturaConcepto> conceptos;
    private BigDecimal total;

}
