package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.MembresiaEntity;
import com.ghost.gympro.domain.models.Membresia;

public interface MembresiaMapper {

    MembresiaEntity toEntity(Membresia membresia);

    Membresia toDomain(MembresiaEntity entity);

}
