package com.ghost.gympro.mappers;

import com.ghost.gympro.domain.models.Factura;
import com.ghost.gympro.infraestructura.entities.FacturaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends MapperBasic<FacturaEntity, Factura> {
}
