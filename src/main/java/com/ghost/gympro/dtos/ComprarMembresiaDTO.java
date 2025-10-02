package com.ghost.gympro.dtos;

import lombok.Data;

@Data
public class ComprarMembresiaDTO {

    private Long vendedor;
    private Long cliente;
    private Long tipoMembresia;
    private Integer metodoPago;
}
