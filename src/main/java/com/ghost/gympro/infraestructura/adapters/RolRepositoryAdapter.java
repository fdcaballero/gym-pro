package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.RolGateway;
import com.ghost.gympro.domain.models.Rol;
import com.ghost.gympro.infraestructura.entities.RolEntity;
import com.ghost.gympro.infraestructura.repository.RolRepository;
import com.ghost.gympro.mappers.RolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class RolRepositoryAdapter extends RepositoryAdapterMaster<RolEntity, Rol, Long, RolRepository, RolMapper> implements RolGateway {

    public RolRepositoryAdapter(RolRepository repository, RolMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Rol findByRolCode(String rolCode) {
        return repository.findByAbreviatura(rolCode)
                .map(mapper::toDomain).orElse(null);
    }

    @Override
    public List<Rol> findAll() {
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }

}
