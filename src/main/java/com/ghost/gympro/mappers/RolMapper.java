package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.RolEntity;
import com.ghost.gympro.domain.models.Rol;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolMapper {

    RolEntity toEntity(Rol rol);

    Rol toDomain(RolEntity entity);
}
