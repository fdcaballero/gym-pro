package com.ghost.gympro.models;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    private Long id;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private Membresia membresia;
}
