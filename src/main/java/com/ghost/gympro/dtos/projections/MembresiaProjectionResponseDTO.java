package com.ghost.gympro.dtos.projections;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MembresiaProjectionResponseDTO {

    private String membresia;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;
}
