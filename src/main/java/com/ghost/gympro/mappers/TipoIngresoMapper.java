package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.TipoIngresoEntity;
import com.ghost.gympro.domain.models.TipoIngreso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoIngresoMapper {


    TipoIngresoEntity toEntity(TipoIngreso ingreso);

    TipoIngreso toDomain(TipoIngresoEntity ingreso);
}
