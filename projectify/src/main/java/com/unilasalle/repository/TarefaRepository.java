package com.unilasalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unilasalle.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
