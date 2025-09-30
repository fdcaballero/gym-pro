package com.ghost.gympro.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ingresos")
public class Ingreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private TipoAcesso tipoAcesso;

    private LocalDateTime fecha;

    @ManyToOne
    private Cliente cliente;
}
