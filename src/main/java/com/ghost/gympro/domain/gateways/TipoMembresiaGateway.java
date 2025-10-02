package com.ghost.gympro.domain.gateways;

import com.ghost.gympro.domain.models.TipoMembresia;

public interface TipoMembresiaGateway {

    TipoMembresia findTipoMembresiaById(Long id);
}
