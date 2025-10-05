package com.ghost.gympro.services;

import com.ghost.gympro.dtos.CrearUsuarioDTO;
import com.ghost.gympro.domain.models.Usuario;

public interface UsuarioService {

    Usuario findUsuarioByEmail(String email);

    Usuario crearUsuario(CrearUsuarioDTO usuario);

    Usuario modificarUsuario(Usuario usuario);

}
