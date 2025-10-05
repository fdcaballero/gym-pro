package com.ghost.gympro.dtos;

import lombok.Data;

import java.util.List;

@Data
public class CreaFacturaDTO {

    private String descripcion;
    private Long cliente;
    private Long empleado;
    List<CreaFacturaConceptoDTO> conceptos;
}


