package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {
}
