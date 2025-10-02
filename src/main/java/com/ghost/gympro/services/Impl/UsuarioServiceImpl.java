package com.ghost.gympro.services.Impl;

import com.ghost.gympro.domain.gateways.ClienteGateway;
import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.gateways.UsuarioGateway;
import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.dtos.CrearUsuarioDTO;
import com.ghost.gympro.domain.models.Persona;
import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioGateway usuarioRepository;
    private final ClienteGateway clienteRepository;
    private final EmpleadoGateway empleadoGateway;

    @Override
    public Usuario findUsuarioByEmail(String email) {
        return usuarioRepository.findUsuarioByEmail(email);
    }

    @Override
    public Usuario crearUsuario(CrearUsuarioDTO request) {
        Usuario usuario = new Usuario();
        usuario.setUsuario(request.getUsuario());
        usuario.setCorreo(request.getCorreo());
        usuario.setPassword(request.getPassword());
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return null;
    }
}
