package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.dtos.CrearUsuarioDTO;
import com.ghost.gympro.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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

    @PostMapping
    public ResponseEntity<String> crearUsuario(@RequestBody CrearUsuarioDTO dto) {

        usuarioService.crearUsuario(dto);

        return new ResponseEntity<>("Usuario base creado con éxito.", HttpStatus.CREATED);
    }


}
