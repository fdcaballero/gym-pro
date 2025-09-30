package com.ghost.gympro.repository;

import com.ghost.gympro.entities.TipoAccesoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPagoRepository extends JpaRepository<TipoAccesoEntity, Long> {
}
