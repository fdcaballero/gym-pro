package com.ghost.gympro.infraestructura.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    @OneToOne
    private UsuarioEntity usuario;

    @ManyToOne
    private MembresiaEntity membresia;
}
