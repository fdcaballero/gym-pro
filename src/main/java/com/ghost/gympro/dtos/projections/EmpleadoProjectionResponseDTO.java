package com.ghost.gympro.dtos.projections;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
public class EmpleadoProjectionResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    private String usuario;


    private Set<String> rolesAbreviados;
}
