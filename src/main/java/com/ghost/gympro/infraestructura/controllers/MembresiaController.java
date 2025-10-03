package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.dtos.ComprarMembresiaDTO;
import com.ghost.gympro.dtos.CreaClienteDTO;
import com.ghost.gympro.dtos.projections.MembresiaProjectionResponseDTO;
import com.ghost.gympro.services.MembresiaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/membresia")
@RequiredArgsConstructor
public class MembresiaController {

    private final MembresiaService membresiaService;


    @PostMapping("/comprar")
    public ResponseEntity<MembresiaProjectionResponseDTO> comprar(@Valid @RequestBody ComprarMembresiaDTO dto) {
        return ResponseEntity.ok(membresiaService.comprarMembresia(dto));
    }
}
