package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.TipoMembresiaGateway;
import com.ghost.gympro.domain.models.TipoMembresia;
import com.ghost.gympro.infraestructura.entities.TipoMembresiaEntity;
import com.ghost.gympro.infraestructura.repository.TipoMembresiaRepository;
import com.ghost.gympro.mappers.TipoMembresiaMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TipoMembresiaRepositoryAdapter
        extends RepositoryAdapterMaster<TipoMembresiaEntity, TipoMembresia, Long, TipoMembresiaRepository, TipoMembresiaMapper>
        implements TipoMembresiaGateway {
    public TipoMembresiaRepositoryAdapter(TipoMembresiaRepository repository, TipoMembresiaMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public TipoMembresia findTipoMembresiaById(Long id) {
        return repository.findById(id).map(mapper::toDomain)
                .orElse(null);
    }
}
