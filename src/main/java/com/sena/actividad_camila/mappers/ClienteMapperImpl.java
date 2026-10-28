package com.sena.actividad_camila.mappers;

import org.springframework.stereotype.Component;

import com.sena.actividad_camila.dtos.ClienteDto;
import com.sena.actividad_camila.models.usuarios.Cliente;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override 
    public ClienteDto toDto(Cliente cliente) {
        //Validar que tenga datos
        if (cliente == null) {
            return null;
        }

        //Convertir de cleinte a clienteDto
        return ClienteDto.builder()
        //atributos de ususaio
        .id(cliente.getId())
        .nomb(cliente.getNom())
        .apell(cliente.getApe())
        .direc(cliente.getDir())

        //atributos de cliente
        .tipCli(cliente.getTipo_Cliente())
        .pts(cliente.getPuntos())
        .build();

    }

    @Override
    public Cliente toEntity(ClienteDto clienteDto) {
        //Validar que tenga datos
        if (clienteDto == null) {
            return null;
        }

            return Cliente.builder()
            //atributos de usuario
            .id(clienteDto.getId())
            .nom(clienteDto.getNomb())
            .ape(clienteDto.getApell())
            .tel(clienteDto.getTele())


            //atributos de cliente
            .tipo_Cliente(clienteDto.getTipCli())
            .puntos(clienteDto.getPts())
            .build();
        

    }

}


