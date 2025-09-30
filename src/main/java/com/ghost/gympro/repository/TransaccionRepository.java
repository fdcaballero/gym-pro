package com.ghost.gympro.repository;

import com.ghost.gympro.entities.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransaccionRepository extends JpaRepository<TransaccionEntity, UUID> {
}
