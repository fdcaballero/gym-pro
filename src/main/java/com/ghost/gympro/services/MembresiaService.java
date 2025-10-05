package com.ghost.gympro.services;

import com.ghost.gympro.dtos.ComprarMembresiaDTO;
import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;

public interface MembresiaService {

    MembresiaProjectionResponseDTO comprarMembresia(ComprarMembresiaDTO dto);
}
