package com.ghost.gympro.infraestructura.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;


@Data
@Entity
@Table(name = "empleados")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String apellido;
    private String nombre;
    private String telefono;
    private String correo;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "empleados_roles", joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"), foreignKey = @ForeignKey(name = "empleado_roles_fk"))
    private Set<RolEntity> roles;

    @JsonIgnoreProperties({ "password" })
    @OneToOne(fetch = FetchType.LAZY)
     private UsuarioEntity usuario;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
}
