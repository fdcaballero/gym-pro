package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {


    @Query(" select t from EmpleadoEntity t join t.roles r where r.abreviatura = :rol")
    List<EmpleadoEntity> findAllByRol(@Param("rol") String rol);
}
