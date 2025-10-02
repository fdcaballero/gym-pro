package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.ClienteGateway;
import com.ghost.gympro.domain.models.Cliente;
import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import com.ghost.gympro.infraestructura.repository.ClienteRepository;
import com.ghost.gympro.mappers.ClienteMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryAdapter extends RepositoryAdapterMaster<ClienteEntity, Cliente, Long, ClienteRepository, ClienteMapper>
        implements ClienteGateway {


    public ClienteRepositoryAdapter(ClienteRepository repository, ClienteMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return mapper.toDomain(repository.save(mapper.toEntity(cliente)));
    }


    @Override
    public List<Cliente> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDomain).toList();
    }

    @Override
    public List<Cliente> findByTipoMembresia(Long tipoMembresia) {
        return repository.findByTipoMembresia(tipoMembresia)
                .stream().map(mapper::toDomain).toList();
    }
}
