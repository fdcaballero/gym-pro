package com.ghost.gympro.models;
import lombok.Data;

import java.util.Set;

@Data
public class Empleado {
    private Long id;
    private String nombre;
    private String telefono;
    private String correo;
    private Set<Rol> rol;
    private Usuario usuario;
}
