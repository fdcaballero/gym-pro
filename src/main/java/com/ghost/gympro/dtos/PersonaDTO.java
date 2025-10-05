package com.ghost.gympro.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonaDTO {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private LocalDate fechaNacimiento;
}
