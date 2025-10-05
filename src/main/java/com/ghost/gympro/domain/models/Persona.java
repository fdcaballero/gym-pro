package com.ghost.gympro.domain.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
}
