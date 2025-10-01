package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.ClienteGateway;
import com.ghost.gympro.domain.models.Cliente;
import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import com.ghost.gympro.infraestructura.repository.ClienteRepository;
import com.ghost.gympro.mappers.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ClienteRepositoryAdapter extends RepositoryAdapterMaster<ClienteEntity, Cliente, Long, ClienteRepository, ClienteMapper>
        implements ClienteGateway {


    @Override
    public Cliente save(Cliente cliente) {
        return mapper.toDomain(repository.save(mapper.toEntity(cliente)));
    }

    @Override
    ClienteEntity update(ClienteEntity clienteEntity) {
        return null;
    }
}
