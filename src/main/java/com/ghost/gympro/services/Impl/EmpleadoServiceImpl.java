package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.gateways.RolGateway;
import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.domain.models.Rol;
import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.dtos.CreaEmpleadoDTO;
import com.ghost.gympro.dtos.CrearUsuarioDTO;
import com.ghost.gympro.dtos.projections.EmpleadoProjectionResponseDTO;
import com.ghost.gympro.mappers.EmpleadoMapper;
import com.ghost.gympro.services.EmpleadoService;
import com.ghost.gympro.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoGateway empleadoGateway;
    private final EmpleadoMapper mapper;
    private final UsuarioService usuarioService;

    private final RolGateway rolesGateway;

    @Override
    public EmpleadoProjectionResponseDTO crearEmpleado(CreaEmpleadoDTO dto) {
        Empleado empleado = new Empleado.EmpleadoBuilder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .fechaNacimiento(dto.getFechaNacimiento())
                .correo(dto.getCorreo())
                .telefono(dto.getTelefono())
                .build();
        Rol rol = rolesGateway.findByRolCode("INS");
        Set<Rol> roles = new HashSet<>();
        roles.add(rol);
        empleado.setRoles(roles);
        Usuario usuario = usuarioService.crearUsuario(dto);
        empleado.setUsuario(usuario);

        return Optional.of(empleadoGateway.save(empleado)).map(mapper::domainToProjection).orElse(null);
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return null;
    }

    @Override
    public List<EmpleadoProjectionResponseDTO> empleadosByRol(String rol) {
        return empleadoGateway.findAllByRol(rol)
                .stream().map(mapper::domainToProjection)
                .toList();
    }
}
