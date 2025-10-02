package com.ghost.gympro.dtos;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreaEmpleadoDTO extends CrearUsuarioDTO {
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fechaNacimiento;
    private Set<String> roles;
}
