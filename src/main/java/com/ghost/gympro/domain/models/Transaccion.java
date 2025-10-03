package com.ghost.gympro.domain.models;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Transaccion {

    private UUID id;

    private LocalDateTime fecha;

    private BigDecimal monto;

    private Cliente cliente;

    private Empleado empleado;

    private TipoPago tipoPago;

    private Factura factura;
}
