package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
}
