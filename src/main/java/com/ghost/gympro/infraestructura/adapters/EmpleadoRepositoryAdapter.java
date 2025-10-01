package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.domain.gateways.EmpleadoGateway;
import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.infraestructura.entities.EmpleadoEntity;
import com.ghost.gympro.infraestructura.repository.EmpleadoRepository;
import com.ghost.gympro.mappers.EmpleadoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmpleadoRepositoryAdapter extends RepositoryAdapterMaster<EmpleadoEntity, Empleado,Long, EmpleadoRepository, EmpleadoMapper> implements EmpleadoGateway {

    @Override
    EmpleadoEntity update(EmpleadoEntity empleadoEntity) {
        return null;
    }
}
