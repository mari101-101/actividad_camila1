package com.sena.actividad_camila.servicesImplement;

import lombok.RequiredArgsConstructor;

import java.util.List;


import org.springframework.stereotype.Service;
import com.sena.actividad_camila.dtos.UsuarioDto;
import com.sena.actividad_camila.mappers.UsuarioMapper;
import com.sena.actividad_camila.models.usuarios.Usuario;
import com.sena.actividad_camila.repositoryes.UsuarioRepository; 
import com.sena.actividad_camila.services.UsuarioService;


@Service
@RequiredArgsConstructor 
public class UsuarioServicesImpl implements UsuarioService {

        private final UsuarioRepository usuarioRepository;
        private final UsuarioMapper usuarioMapper;

        @Override 
        public UsuarioDto guardar(UsuarioDto usuarioDto) {
                Usuario usuario = usuarioMapper.convierteaEntidad(usuarioDto);
                Usuario usuarioGuardado = usuarioRepository.save(usuario);
                return usuarioMapper.convierteaDto(usuarioGuardado);
        }

        public List<UsuarioDto> ListarTodos() {
                return usuarioRepository.findAll().stream()
                        .map(usuarioMapper::convierteaDto)
                        .toList();
        }

}
