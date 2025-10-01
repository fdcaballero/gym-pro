package com.ghost.gympro.infraestructura.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_ingresos")
public class TipoIngresoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    private EstadoEntity estado;

}
