package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.Factura;
import com.ghost.gympro.dtos.CreaFacturaDTO;

public interface FacturaService {

    Factura crearFactura(CreaFacturaDTO f);
}
