package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.TipoIngresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAccesoRepository extends JpaRepository<TipoIngresoEntity, Long> {
}
