package com.ghost.gympro.infraestructura.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tipos_membresias")
public class TipoMembresiaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String nombre;

    @Column(length = 500, nullable = false)
    private String descripcion;

    @Column(name = "duracion_dias")
    private int duracion;

    private BigDecimal costo;
}
