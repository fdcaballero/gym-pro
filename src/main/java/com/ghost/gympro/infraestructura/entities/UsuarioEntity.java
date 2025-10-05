package com.ghost.gympro.infraestructura.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", unique = true, nullable = false)
    private String usuario;

    private String password;

    @Column(name = "email", unique = true, nullable = false)
    private String correo;

    private Boolean activo;

}
