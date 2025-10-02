package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.UsuarioGateway;
import com.ghost.gympro.domain.models.Usuario;
import com.ghost.gympro.infraestructura.entities.UsuarioEntity;
import com.ghost.gympro.infraestructura.repository.UsuarioRepository;
import com.ghost.gympro.mappers.UsuarioMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryAdapter extends RepositoryAdapterMaster<UsuarioEntity, Usuario, Long, UsuarioRepository, UsuarioMapper> implements UsuarioGateway {


    public UsuarioRepositoryAdapter(UsuarioRepository repository, UsuarioMapper mapper) {
        super(repository, mapper);
    }



    @Override
    public Usuario findUsuarioByEmail(String email) {
        return repository.findByCorreo(email);
    }
}
