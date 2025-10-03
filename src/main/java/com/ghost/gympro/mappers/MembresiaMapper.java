package com.ghost.gympro.mappers;

import com.ghost.gympro.domain.models.TipoMembresia;
import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;
import com.ghost.gympro.infraestructura.entities.MembresiaEntity;
import com.ghost.gympro.domain.models.Membresia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MembresiaMapper extends MapperBasic<MembresiaEntity, Membresia> {


    @Mapping(source = "tipoMembresia", target = "membresia")
    MembresiaProjectionResponseDTO domainToProjection(Membresia membresia);


    default String mapTipoMembresiaToMembresia(TipoMembresia tp) {
        if (tp == null) return "";

        return tp.getNombre();

    }
}
