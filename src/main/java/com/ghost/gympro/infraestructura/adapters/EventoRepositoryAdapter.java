package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.EventoGateway;
import com.ghost.gympro.domain.models.Evento;
import com.ghost.gympro.infraestructura.entities.EventoEntity;
import com.ghost.gympro.infraestructura.repository.EventoRepository;
import com.ghost.gympro.mappers.EventoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EventoRepositoryAdapter extends RepositoryAdapterMaster<EventoEntity, Evento, Long, EventoRepository, EventoMapper>
        implements EventoGateway {


    public EventoRepositoryAdapter(EventoRepository repository, EventoMapper mapper) {
        super(repository, mapper);
    }


}
