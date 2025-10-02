package com.ghost.gympro.mappers;

import com.ghost.gympro.dtos.projections.ClienteProjectionResponseDTO;
import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import com.ghost.gympro.domain.models.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends MapperBasic<ClienteEntity, Cliente> {

    @Mapping(source = "usuario.usuario", target = "usuario")
    @Mapping(source = "membresia.tipoMembresia.nombre", target = "membresia")
    @Mapping(source = "membresia.fechaInicio", target = "fechaInicio")
    @Mapping(source = "membresia.fechaFin", target = "fechaFin")
    ClienteProjectionResponseDTO domainToProjection(Cliente cliente);

}
