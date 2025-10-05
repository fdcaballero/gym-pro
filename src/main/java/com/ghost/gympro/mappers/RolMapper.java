package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.RolEntity;
import com.ghost.gympro.domain.models.Rol;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RolMapper extends MapperBasic<RolEntity, Rol> {

}
