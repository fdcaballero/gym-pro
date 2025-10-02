package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.ClienteGateway;
import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.gateways.MembresiaGateway;
import com.ghost.gympro.domain.gateways.TipoMembresiaGateway;
import com.ghost.gympro.domain.models.*;
import com.ghost.gympro.dtos.ComprarMembresiaDTO;
import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;
import com.ghost.gympro.mappers.MembresiaMapper;
import com.ghost.gympro.services.MembresiaService;
import com.ghost.gympro.services.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MembresiaServiceImpl implements MembresiaService {

    private final MembresiaGateway gateway;
    private final MembresiaMapper mapper;
    private final EmpleadoGateway empleadoGateway;
    private final ClienteGateway clienteGateway;
    private final TipoMembresiaGateway tipoMembresiaGateway;
    private final TransaccionService transaccionService;
    private final String estadoInicial = "ACT";

    @Override
    public MembresiaProjectionResponseDTO comprar(ComprarMembresiaDTO dto) {
        Membresia membresia = new Membresia();
        TipoMembresia tipoMembresia = tipoMembresiaGateway.findTipoMembresiaById(dto.getTipoMembresia());
        membresia.setTipoMembresia(tipoMembresia);
        membresia.setFechaInicio(LocalDate.now());
        membresia.setFechaFin(LocalDate.now().plusDays(tipoMembresia.getDuracion()));

        Transaccion transaccion = new Transaccion();
        transaccion.setFecha(LocalDateTime.now());
        transaccion.setMonto(tipoMembresia.getCosto());
        Empleado empleado = empleadoGateway.findById(dto.getVendedor()).orElse(null);
        transaccion.setEmpleado(empleado);
        Cliente cliente = clienteGateway.findById(dto.getCliente()).orElse(null);
        transaccion.setCliente(cliente);



        return Optional.of(gateway.save(membresia))
                .map(mapper::domainToProjection).orElse(null);
        //TODO asignar estado
    }
}
