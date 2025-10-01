package com.ghost.gympro.infraestructura.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Data
@Entity
@Table(name = "empleados")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String telefono;
    private String correo;
    @ManyToMany
    @JoinTable(name = "empleados_roles", joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"), foreignKey = @ForeignKey(name = "empleado_roles_fk"))
    private Set<RolEntity> roles;

    @OneToOne
    private UsuarioEntity usuario;
}
