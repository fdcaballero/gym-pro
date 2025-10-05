package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.MembresiaGateway;
import com.ghost.gympro.domain.models.Membresia;
import com.ghost.gympro.infraestructura.entities.MembresiaEntity;
import com.ghost.gympro.infraestructura.repository.MembresiaRepository;
import com.ghost.gympro.mappers.MembresiaMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class MembresiaRepositoryAdapter
        extends RepositoryAdapterMaster<MembresiaEntity, Membresia, Long, MembresiaRepository, MembresiaMapper>
        implements MembresiaGateway {

    public MembresiaRepositoryAdapter(MembresiaRepository repository, MembresiaMapper mapper) {
        super(repository, mapper);
    }


}
