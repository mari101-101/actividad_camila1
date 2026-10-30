package com.sena.actividad_camila.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.actividad_camila.services.UsuarioService;

import lombok.RequiredArgsConstructor;

import com.sena.actividad_camila.dtos.UsuarioDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping ("api/usuario")
@RequiredArgsConstructor 
public class UsuarioController {
  
    private final UsuarioService usuarioServices;
    
    //registrar usuario
    @PostMapping 
    public ResponseEntity<UsuarioDto> guardar(@RequestBody UsuarioDto usuarioDto) {
        UsuarioDto usuarioGuardado = usuarioServices.guardar(usuarioDto);
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(usuarioGuardado);

    }

    //listar todos los usuarios
    @GetMapping
    public ResponseEntity<List<UsuarioDto>> listarTodos() {
        return ResponseEntity.ok(usuarioServices.ListarTodos());
    }
}
