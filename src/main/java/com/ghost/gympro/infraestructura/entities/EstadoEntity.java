package com.ghost.gympro.infraestructura.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estados")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;

    private String abreviatura;
}
