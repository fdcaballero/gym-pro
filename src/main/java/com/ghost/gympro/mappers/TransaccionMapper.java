package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.TransaccionEntity;
import com.ghost.gympro.domain.models.Transaccion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransaccionMapper extends MapperBasic<TransaccionEntity, Transaccion> {


}
