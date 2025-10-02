package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity, Long> {
}
