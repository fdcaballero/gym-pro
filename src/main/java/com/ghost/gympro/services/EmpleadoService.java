package com.ghost.gympro.services;

import com.ghost.gympro.domain.models.Empleado;
import com.ghost.gympro.dtos.CreaEmpleadoDTO;
import com.ghost.gympro.dtos.projections.EmpleadoProjectionResponseDTO;

import java.util.List;

public interface EmpleadoService {

    EmpleadoProjectionResponseDTO crearEmpleado(CreaEmpleadoDTO empleado);

    Empleado actualizar(Empleado empleado);

    List<EmpleadoProjectionResponseDTO> empleadosByRol(String rol);

}
