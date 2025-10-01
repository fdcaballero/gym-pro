package com.ghost.gympro.dtos;

import com.ghost.gympro.domain.models.Rol;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreaEmpleadoDTO extends CrearUsuarioDTO {
    private Set<String> roles;
}
