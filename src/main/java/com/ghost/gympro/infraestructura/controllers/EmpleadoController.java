package com.ghost.gympro.infraestructura.controllers;


import com.ghost.gympro.dtos.CreaEmpleadoDTO;
import com.ghost.gympro.dtos.projections.EmpleadoProjectionResponseDTO;
import com.ghost.gympro.services.EmpleadoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empleados")
@RequiredArgsConstructor
public class EmpleadoController {

    private final EmpleadoService empleadoService;


    @PostMapping
    public ResponseEntity<EmpleadoProjectionResponseDTO> registraEmpleado(@Valid @RequestBody CreaEmpleadoDTO empleadoDTO) {
        return new ResponseEntity<>(empleadoService.crearEmpleado(empleadoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmpleadoProjectionResponseDTO>> getInstructores(@RequestParam(required = true, value = "INS") String rol) {
        return ResponseEntity.ok(empleadoService.empleadosByRol(rol));
    }
}
