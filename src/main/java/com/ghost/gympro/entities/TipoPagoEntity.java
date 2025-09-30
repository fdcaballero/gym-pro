package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_pagos")
public class TipoPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private String abreviatura;

}
