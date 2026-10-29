package com.sena.actividad_camila.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.actividad_camila.models.usuarios.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
