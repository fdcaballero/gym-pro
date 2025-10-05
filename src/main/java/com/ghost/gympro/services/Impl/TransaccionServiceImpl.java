package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.TransaccionGateway;
import com.ghost.gympro.domain.models.Transaccion;
import com.ghost.gympro.mappers.TransaccionMapper;
import com.ghost.gympro.services.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransaccionServiceImpl implements TransaccionService {

    private final TransaccionGateway transaccionGateway;
    private final TransaccionMapper transaccionMapper;


    Transaccion crear(Transaccion transaccion) {
        return transaccionGateway.save(transaccion);
    }

}
