package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.EstadoEntity;
import com.ghost.gympro.domain.models.Estado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoMapper {


    EstadoEntity toEntity(Estado estado);

    Estado toDomain(EstadoEntity estadoEntity);
}
