package com.ghost.gympro.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Rol extends Base<Integer> {

    public Rol(Integer id, String descripcion, String abreviatura) {
        super(id, descripcion, abreviatura);
    }

    public Rol() {
        super();
    }

    public Rol(String descripcion, String abreviatura) {
        super(descripcion, abreviatura);
    }
}
