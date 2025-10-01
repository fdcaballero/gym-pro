package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.domain.models.Cliente;
import com.ghost.gympro.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClienteController {
    private ClienteService clienteService;


    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {

        return null;
    }
}
