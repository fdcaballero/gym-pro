package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.UsuarioGateway;
import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.infraestructura.entities.UsuarioEntity;
import com.ghost.gympro.infraestructura.repository.UsuarioRepository;
import com.ghost.gympro.mappers.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter extends RepositoryAdapterMaster<UsuarioEntity, Usuario, Long, UsuarioRepository, UsuarioMapper> implements UsuarioGateway {


    @Override
    UsuarioEntity update(UsuarioEntity usuarioEntity) {
        return null;
    }

    @Override
    public Usuario findUsuarioByEmail(String email) {
        return repository.findByEmail(email);
    }
}
