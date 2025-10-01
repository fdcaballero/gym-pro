package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import com.ghost.gympro.domain.models.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends MapperBasic<ClienteEntity, Cliente> {

}
