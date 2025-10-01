package com.ghost.gympro.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CrearUsuarioDTO {
    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;
    private String telefono;
    private String password;
    private LocalDate fechaNacimiento;
}
