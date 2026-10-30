package com.sena.actividad_camila.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sena.actividad_camila.dtos.UsuarioDto;
import com.sena.actividad_camila.models.usuarios.Usuario;

@Mapper (componentModel = "spring")
public interface UsuarioMapper {

    //convertir de Entidad a DTO

    @Mapping (source = "nom", target = "nomb")
    @Mapping (source = "ape", target = "apell")
    @Mapping (source = "dir", target = "direc")
    @Mapping (source = "tel", target = "tele")
    UsuarioDto convierteaDto(Usuario usuario);

    //convertir de DTO a Entidad

    @Mapping (source = "nomb", target = "nom")
    @Mapping (source = "apell", target = "ape")
    @Mapping (source = "direc", target = "dir")
    @Mapping (source = "tele", target = "tel")
    Usuario convierteaEntidad(UsuarioDto usuarioDto);


}

