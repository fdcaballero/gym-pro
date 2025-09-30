package com.ghost.gympro.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TipoPago extends Base<Integer> {

    public TipoPago(Integer id, String descripcion, String abreviatura) {
        super(id, descripcion, abreviatura);
    }

    public TipoPago() {
        super();
    }

    public TipoPago(String descripcion, String abreviatura) {
        super(descripcion, abreviatura);
    }
}
