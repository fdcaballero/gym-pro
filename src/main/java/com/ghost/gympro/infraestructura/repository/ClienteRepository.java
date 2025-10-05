package com.ghost.gympro.infraestructura.repository;

import com.ghost.gympro.infraestructura.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {


    @Query("""
            select c from ClienteEntity c 
                        JOIN FETCH c.membresia m 
                                    JOIN FETCH m.tipoMembresia tm
                                                 WHERE tm.id =:tipoMembresia
            """)
    List<ClienteEntity> findByTipoMembresia(@Param("tipoMembresia") Long tipoMembresia);
}
