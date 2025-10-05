package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.*;
import com.ghost.gympro.domain.models.*;
import com.ghost.gympro.dtos.CompraDTO;
import com.ghost.gympro.dtos.ComprarMembresiaDTO;
import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;
import com.ghost.gympro.mappers.MembresiaMapper;
import com.ghost.gympro.services.MembresiaService;
import com.ghost.gympro.services.TransaccionService;
import com.ghost.gympro.utils.CompraTemplate;
import com.ghost.gympro.utils.Comprar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MembresiaServiceImpl extends CompraTemplate<Membresia> implements MembresiaService {

    private final MembresiaGateway gateway;
    private final MembresiaMapper mapper;
    private final EmpleadoGateway empleadoGateway;
    private final ClienteGateway clienteGateway;
    private final TipoMembresiaGateway tipoMembresiaGateway;
    private final TransaccionGateway transaccionGateway;

    @Override
    public MembresiaProjectionResponseDTO comprarMembresia(ComprarMembresiaDTO dto) {

        TipoMembresia tipoMembresia = tipoMembresiaGateway.findTipoMembresiaById(dto.getTipoMembresia());
        dto.setValor(tipoMembresia.getCosto());
        return Optional.of(comprar(dto))
                .map(mapper::domainToProjection).orElse(null);
    }

    @Override
    protected Membresia ejecutarCompra(Comprar request) {
        ComprarMembresiaDTO dto = (ComprarMembresiaDTO) request;
        Membresia membresia = new Membresia();
        TipoMembresia tipoMembresia = tipoMembresiaGateway.findTipoMembresiaById(dto.getTipoMembresia());
        membresia.setTipoMembresia(tipoMembresia);
        membresia.setFechaInicio(LocalDate.now());
        membresia.setFechaFin(LocalDate.now().plusDays(tipoMembresia.getDuracion()));
        Membresia membresiaBD = gateway.save(membresia);
        clienteGateway.findById(dto.getCliente()).map(cliente -> {
            cliente.setMembresia(membresiaBD);
            return cliente;
        }).map(clienteGateway::save);
        return membresiaBD;
    }

    @Override
    protected void getTransaccion(Comprar dto) {
        ComprarMembresiaDTO comprarMembresiaDTO = (ComprarMembresiaDTO) dto;
        Transaccion transaccion = new Transaccion();
        transaccion.setFecha(LocalDateTime.now());
        transaccion.setMonto(comprarMembresiaDTO.getValor());
        Empleado empleado = empleadoGateway.findById(dto.getVendedor()).orElse(null);
        transaccion.setEmpleado(empleado);
        Cliente cliente = clienteGateway.findById(dto.getCliente()).orElse(null);
        transaccion.setCliente(cliente);
        transaccionGateway.save(transaccion);

    }
}
