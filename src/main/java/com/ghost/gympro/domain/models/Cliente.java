package com.ghost.gympro.domain.models;

import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Persona {

    private Membresia membresia;
}
