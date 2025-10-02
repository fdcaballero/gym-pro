package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.UsuarioEntity;
import com.ghost.gympro.domain.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Usuario findByCorreo(String email);
}
