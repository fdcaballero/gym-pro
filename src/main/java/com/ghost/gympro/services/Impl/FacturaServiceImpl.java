package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.FacturaGateway;
import com.ghost.gympro.domain.models.Factura;
import com.ghost.gympro.dtos.CreaFacturaDTO;
import com.ghost.gympro.services.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacturaServiceImpl implements FacturaService {

    private final FacturaGateway facturaGateway;

    @Override
    public Factura crearFactura(CreaFacturaDTO request) {
//      todo  return facturaGateway.save();
        return null;
    }
}
