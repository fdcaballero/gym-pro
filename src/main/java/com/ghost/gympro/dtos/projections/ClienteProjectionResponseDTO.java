package com.ghost.gympro.dtos.projections;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteProjectionResponseDTO {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private LocalDate fechaNacimiento;
    private String usuario;
    private String membresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

}
