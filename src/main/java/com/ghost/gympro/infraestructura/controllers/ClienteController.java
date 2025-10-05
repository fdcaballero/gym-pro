package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.dtos.CreaClienteDTO;
import com.ghost.gympro.dtos.projections.ClienteProjectionResponseDTO;
import com.ghost.gympro.services.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;


    @PostMapping
    public ResponseEntity<ClienteProjectionResponseDTO> save(@Valid @RequestBody CreaClienteDTO dto) {
        return new ResponseEntity<>(clienteService.crear(dto), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClienteProjectionResponseDTO>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/tipo-membresia")
    public ResponseEntity<List<ClienteProjectionResponseDTO>> findByTipoMembresia(@RequestParam Long tipoMembresia) {
        return ResponseEntity.ok(clienteService.findAllByTipoMembresia(tipoMembresia));
    }
}
