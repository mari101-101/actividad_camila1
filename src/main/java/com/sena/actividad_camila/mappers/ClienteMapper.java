package com.sena.actividad_camila.mappers;

import com.sena.actividad_camila.dtos.ClienteDto;
import com.sena.actividad_camila.models.usuarios.Cliente;

public interface ClienteMapper {

    // De cliente a ClienteDto
    ClienteDto toDto(Cliente cliente);

    // De ClienteDto a cliente
    Cliente toEntity(ClienteDto clienteDto);
}