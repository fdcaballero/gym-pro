package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<EstadoEntity, Long> {
}
