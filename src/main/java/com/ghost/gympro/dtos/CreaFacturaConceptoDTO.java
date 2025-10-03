package com.ghost.gympro.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreaFacturaConceptoDTO {
    private Integer concepto;
    private Integer cantidad;
    private BigDecimal total;
}
