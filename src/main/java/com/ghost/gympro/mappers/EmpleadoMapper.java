package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import com.ghost.gympro.domain.models.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper extends MapperBasic<EmpleadoEntity, Empleado> {

}
