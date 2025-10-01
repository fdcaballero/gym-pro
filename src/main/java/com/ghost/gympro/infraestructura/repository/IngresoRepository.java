package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.IngresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepository extends JpaRepository<IngresoEntity, Long> {
}
