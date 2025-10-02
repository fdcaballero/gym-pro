package com.ghost.gympro.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Data
public class CreaClienteDTO extends CrearUsuarioDTO {
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fechaNacimiento;
}
