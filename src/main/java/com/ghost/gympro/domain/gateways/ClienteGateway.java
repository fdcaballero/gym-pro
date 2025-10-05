package com.ghost.gympro.domain.gateways;


import com.ghost.gympro.domain.models.Cliente;

import java.util.List;

public interface ClienteGateway extends CrudGateway<Cliente, Long> {

    List<Cliente> findAll();

    List<Cliente> findByTipoMembresia(Long tipoMembresia);
}
