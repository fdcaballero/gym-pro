package com.ghost.gympro.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "transacciones")
public class TransaccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private LocalDateTime fecha;

    private BigDecimal monto;

    @ManyToOne
    private ClienteEntity cliente;

    @ManyToOne
    private EmpleadoEntity empleado;

    @ManyToOne
    private TipoPagoEntity tipoPago;

}
