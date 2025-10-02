package com.ghost.gympro.mappers;

import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;
import com.ghost.gympro.infraestructura.entities.MembresiaEntity;
import com.ghost.gympro.domain.models.Membresia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MembresiaMapper extends MapperBasic<MembresiaEntity, Membresia> {


    MembresiaProjectionResponseDTO domainToProjection(Membresia membresia);
}
