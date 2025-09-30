package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private LocalDateTime fecha;

    private BigDecimal monto;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private TipoPago tipoPago;

}
