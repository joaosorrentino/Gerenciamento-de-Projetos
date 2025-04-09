package com.unilasalle.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjeto;

    private String nome;
    private String descricao;
    private String prazo;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Usuario owner;

    @OneToMany(mappedBy = "projeto")
    private List<Tarefa> tarefas;

    @OneToMany(mappedBy = "projeto")
    private List<Recurso> recursos;
}

	