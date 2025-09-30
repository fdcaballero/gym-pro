package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;

    @OneToOne
    private Usuario usuario;
}
