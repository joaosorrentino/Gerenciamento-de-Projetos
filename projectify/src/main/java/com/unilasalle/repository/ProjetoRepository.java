package com.unilasalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unilasalle.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
