package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_ingresos")
public class TipoAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    private Estado estado;

}
