package com.ghost.gympro.infraestructura.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ingresos")
public class IngresoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private TipoIngresoEntity tipoAcesso;

    private LocalDateTime fecha;

    @ManyToOne
    private ClienteEntity cliente;
}
