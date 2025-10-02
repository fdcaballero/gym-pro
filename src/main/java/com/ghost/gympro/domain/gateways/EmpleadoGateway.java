package com.ghost.gympro.domain.gateways;

import com.ghost.gympro.domain.models.Empleado;

import java.util.List;

public interface EmpleadoGateway extends CrudGateway<Empleado, Long> {

    List<Empleado> findAllByRol(String rol);

}
