package com.ghost.gympro.domain.gateways;

import com.ghost.gympro.domain.models.Usuario;

public interface UsuarioGateway {

    Usuario findUsuarioByEmail(String email);
}
