package com.ghost.gympro.dtos;

import com.ghost.gympro.domain.models.Producto;
import com.ghost.gympro.utils.Comprar;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ComprarMembresiaDTO extends CompraDTO implements Comprar {

    private Long tipoMembresia;
//    private Integer metodoPago;

    public ComprarMembresiaDTO(Long vendedor, Long cliente, Long producto, Long tipoMembresia) {
        super(vendedor, cliente, producto);
        this.tipoMembresia = tipoMembresia;
//        this.metodoPago = metodoPago;
    }

    public ComprarMembresiaDTO(Long tipoMembresia) {

        this.tipoMembresia = tipoMembresia;
//        this.metodoPago = metodoPago;
    }


}
