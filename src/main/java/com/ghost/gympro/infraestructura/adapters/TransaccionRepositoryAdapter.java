package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.TransaccionGateway;
import com.ghost.gympro.domain.models.Transaccion;
import com.ghost.gympro.infraestructura.entities.TransaccionEntity;
import com.ghost.gympro.infraestructura.repository.TransaccionRepository;
import com.ghost.gympro.mappers.TransaccionMapper;
import org.springframework.stereotype.Repository;


 import java.util.UUID;

@Repository
public class TransaccionRepositoryAdapter extends RepositoryAdapterMaster<TransaccionEntity,
        Transaccion, UUID, TransaccionRepository, TransaccionMapper> implements TransaccionGateway {

    public TransaccionRepositoryAdapter(TransaccionRepository repository, TransaccionMapper mapper) {
        super(repository, mapper);
    }


}
