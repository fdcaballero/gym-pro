package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.dtos.CreaClienteDTO;
import com.ghost.gympro.dtos.projections.ClienteProjectionResponseDTO;

import java.util.List;

public interface ClienteService {

    ClienteProjectionResponseDTO crear(CreaClienteDTO cliente);

    List<ClienteProjectionResponseDTO> findAll();
    List<ClienteProjectionResponseDTO> findAllByTipoMembresia(Long tipoMembresia);
}
