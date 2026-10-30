package com.sena.actividad_camila.services;

import java.util.List;

import com.sena.actividad_camila.dtos.UsuarioDto;

public interface UsuarioService {

        //registrar usuario
        UsuarioDto guardar (UsuarioDto usuarioDto);

        //listar todos los usuarios
        List<UsuarioDto> ListarTodos();

}
