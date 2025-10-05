package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.TipoPagoEntity;
import com.ghost.gympro.domain.models.TipoPago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoPagoMapper {

    TipoPagoEntity toEntity(TipoPago tp);

    TipoPago toDomain(TipoPago tp);
}
