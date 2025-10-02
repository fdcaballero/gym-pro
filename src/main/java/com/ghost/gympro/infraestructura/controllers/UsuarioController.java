package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.dtos.IniciarSesionDTO;
import com.ghost.gympro.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/iniciar-sesion")
    public ResponseEntity<String> iniciarSesion(@Valid @RequestBody IniciarSesionDTO dto) {
        return null;
    }


}
