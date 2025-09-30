package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_ingresos")
public class TipoAccesoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    private EstadoEntity estado;

}
