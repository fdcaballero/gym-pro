package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import com.ghost.gympro.infraestructura.repository.EmpleadoRepository;
import com.ghost.gympro.mappers.EmpleadoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class EmpleadoRepositoryAdapter extends RepositoryAdapterMaster<EmpleadoEntity, Empleado, Long, EmpleadoRepository, EmpleadoMapper> implements EmpleadoGateway {


    public EmpleadoRepositoryAdapter(EmpleadoRepository repository, EmpleadoMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public List<Empleado> findAllByRol(String rol) {
        return repository.findAllByRol(rol)
                .stream().map(mapper::toDomain)
                .toList();
    }
}
