package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.TipoMembresia;

import java.util.List;

public interface TipoMembresiaService {

    List<TipoMembresia> findAll();
    List<TipoMembresia> findByNombre(String nombre);

}
