package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.dtos.CreaEmpleadoDTO;
import com.ghost.gympro.services.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoGateway empleadoGateway;

    @Override
    public Empleado crearEmpleado(CreaEmpleadoDTO dto) {

        //TODO buscar roles by name;
        // crear objeto usuario;
        // Gurdar empleado

        Empleado empleado = new Empleado.EmpleadoBuilder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .fechaNacimiento(dto.getFechaNacimiento())
                .correo(dto.getCorreo())
                .telefono(dto.getTelefono())
                .build();


        return null;
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return null;
    }
}
