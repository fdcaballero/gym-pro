package com.ghost.gympro.domain.models;


import lombok.Data;

import java.time.LocalDate;

@Data
public class Membresia {

    private Long id;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Estado estado;

    private TipoMembresia tipoMembresia;
}
