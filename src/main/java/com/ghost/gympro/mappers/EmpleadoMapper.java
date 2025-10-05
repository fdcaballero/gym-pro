package com.ghost.gympro.mappers;

import com.ghost.gympro.domain.models.Rol;
import com.ghost.gympro.dtos.projections.EmpleadoProjectionResponseDTO;
import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import com.ghost.gympro.domain.models.Empleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper extends MapperBasic<EmpleadoEntity, Empleado> {

    @Mapping(source = "usuario.usuario", target = "usuario")

    @Mapping(source = "roles", target = "rolesAbreviados")
    EmpleadoProjectionResponseDTO domainToProjection(Empleado empleado);


    default String mapRolToAbreviatura(Rol rolEntity) {
        if (rolEntity == null) {
            return null;
        }
        return rolEntity.getAbreviatura();
    }
}
