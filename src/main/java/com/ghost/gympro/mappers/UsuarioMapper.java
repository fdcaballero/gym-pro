package com.ghost.gympro.mappers;

import com.ghost.gympro.infraestructura.entities.UsuarioEntity;
import com.ghost.gympro.domain.models.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends MapperBasic<UsuarioEntity, Usuario> {

    @Mapping(source = "correo", target = "correo")
    UsuarioEntity toEntity(Usuario usuario);

    Usuario toDomain(UsuarioEntity usuarioEntity);

}
