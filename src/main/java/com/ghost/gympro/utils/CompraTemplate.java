package com.ghost.gympro.utils;

import com.ghost.gympro.domain.models.Transaccion;
import com.ghost.gympro.dtos.CompraDTO;

public abstract class CompraTemplate<T> {

    public T comprar(Comprar compraDTO) {
        T obj = this.ejecutarCompra(compraDTO);
        this.getTransaccion(compraDTO);
        return obj;
    }

    protected abstract T ejecutarCompra(Comprar compra);

    protected abstract void getTransaccion(Comprar compra);


}
