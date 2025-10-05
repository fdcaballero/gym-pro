package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.FacturaGateway;
import com.ghost.gympro.domain.models.Factura;
import com.ghost.gympro.infraestructura.entities.FacturaEntity;
import com.ghost.gympro.infraestructura.repository.FacturaRepository;
import com.ghost.gympro.mappers.FacturaMapper;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaRepositoryAdapter extends RepositoryAdapterMaster<FacturaEntity, Factura,Long, FacturaRepository, FacturaMapper> implements FacturaGateway {

    public FacturaRepositoryAdapter(FacturaRepository repository, FacturaMapper mapper) {
        super(repository, mapper);
    }


}
