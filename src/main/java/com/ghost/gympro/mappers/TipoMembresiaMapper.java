package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.TipoMembresiaEntity;
import com.ghost.gympro.domain.models.TipoMembresia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoMembresiaMapper {

    TipoMembresiaEntity toEntity(TipoMembresia tipoMembresia);

    TipoMembresia toDomain(TipoMembresiaEntity tipoMembresia);
}
