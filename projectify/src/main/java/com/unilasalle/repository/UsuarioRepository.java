package com.unilasalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unilasalle.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
