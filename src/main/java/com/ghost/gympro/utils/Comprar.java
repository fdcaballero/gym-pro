package com.ghost.gympro.utils;

import com.ghost.gympro.domain.models.Producto;

import java.math.BigDecimal;

public interface Comprar {
    Long getVendedor();

    Long getCliente();

    BigDecimal getValor();

    Long getProducto();

}
