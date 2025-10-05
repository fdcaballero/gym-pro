package com.ghost.gympro.domain.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Evento {

    private Long id;
    private String nombre;
    private String descripcion;
    private String lugar;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private LocalDate fecha;
}
