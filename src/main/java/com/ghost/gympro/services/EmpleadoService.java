package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.dtos.CreaEmpleadoDTO;

public interface EmpleadoService {

    Empleado crearEmpleado(CreaEmpleadoDTO empleado);

    Empleado actualizar(Empleado empleado);

}
