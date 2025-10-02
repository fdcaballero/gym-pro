package com.ghost.gympro.mappers;

import com.ghost.gympro.domain.models.Evento;
import com.ghost.gympro.infraestructura.entities.EventoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventoMapper extends MapperBasic<EventoEntity, Evento> {
}
