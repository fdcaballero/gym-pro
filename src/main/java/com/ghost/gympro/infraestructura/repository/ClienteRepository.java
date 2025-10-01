package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {
}
