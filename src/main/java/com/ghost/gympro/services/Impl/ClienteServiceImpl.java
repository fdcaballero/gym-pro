package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.ClienteGateway;
import com.ghost.gympro.domain.models.Cliente;
import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.dtos.CreaClienteDTO;
import com.ghost.gympro.dtos.projections.ClienteProjectionResponseDTO;
import com.ghost.gympro.mappers.ClienteMapper;
import com.ghost.gympro.services.ClienteService;
import com.ghost.gympro.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteGateway gateway;
    private final ClienteMapper mapper;
    private final UsuarioService usuarioService;


    @Override
    public ClienteProjectionResponseDTO crear(CreaClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setCorreo(dto.getCorreo());
        cliente.setTelefono(dto.getTelefono());
        cliente.setFechaNacimiento(dto.getFechaNacimiento());
        Usuario usuario = usuarioService.crearUsuario(dto);
        cliente.setUsuario(usuario);

        return Optional.of(gateway.save(cliente))
                .map(mapper::domainToProjection)
                .orElse(null);
    }


    @Override
    public List<ClienteProjectionResponseDTO> findAll() {
        return gateway.findAll().stream()
                .map(mapper::domainToProjection).toList();
    }

    @Override
    public List<ClienteProjectionResponseDTO> findAllByTipoMembresia(Long tipoMembresia) {
        return gateway.findByTipoMembresia(tipoMembresia)
                .stream().map(mapper::domainToProjection).toList();
    }
}
