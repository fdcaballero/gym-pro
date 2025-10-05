package com.ghost.gympro.domain.gateways;

import com.ghost.gympro.domain.models.Rol;

import java.util.List;

public interface RolGateway {

    Rol findByRolCode(String rolCode);

    List<Rol> findAll();
}
