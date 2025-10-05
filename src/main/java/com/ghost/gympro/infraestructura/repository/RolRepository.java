package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.domain.models.Rol;
import com.ghost.gympro.infraestructura.entities.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
    Optional<RolEntity> findByAbreviatura(String abreviatura);
}
