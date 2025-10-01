package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.dtos.CrearUsuarioDTO;

public interface ClienteService {

    Usuario findUsuarioByEmail(String email);

    Usuario crearUsuario(CrearUsuarioDTO usuario);

    Usuario modificarUsuario(Usuario usuario);

}
