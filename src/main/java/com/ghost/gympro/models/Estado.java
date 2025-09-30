package com.ghost.gympro.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Estado extends Base<Long> {

    public Estado() {
        super();
    }

    public Estado(String descripcion, String abreviatura) {
        super(descripcion, abreviatura);
    }

    public Estado(Long id, String descripcion, String abreviatura) {
        super(id, descripcion, abreviatura);
    }
}
