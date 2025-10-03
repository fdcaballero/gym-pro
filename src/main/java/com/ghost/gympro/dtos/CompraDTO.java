package com.ghost.gympro.dtos;

import com.ghost.gympro.domain.models.Producto;
import com.ghost.gympro.utils.Comprar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompraDTO implements Comprar {
    private Long vendedor;
    private Long cliente;
    private Long producto;
    private BigDecimal valor;
//    private Integer metodoPago;


    public CompraDTO(Long vendedor, Long cliente, Long producto) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.producto = producto;
    }
}

