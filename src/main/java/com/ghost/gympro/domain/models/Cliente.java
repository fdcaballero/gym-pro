package com.ghost.gympro.domain.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
 @Builder
public class Cliente extends Persona {

    private Membresia membresia;
}
