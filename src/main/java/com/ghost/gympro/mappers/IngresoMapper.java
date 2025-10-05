package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.IngresoEntity;
import com.ghost.gympro.domain.models.Ingreso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngresoMapper {


    IngresoEntity toEntity(Ingreso ingreso);

    Ingreso toDomain(IngresoEntity ingreso);
}
