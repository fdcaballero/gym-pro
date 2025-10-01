package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransaccionRepository extends JpaRepository<TransaccionEntity, UUID> {
}
