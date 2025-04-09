package com.unilasalle.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nome;
    private Integer idade;
    private String email;
    private String cargo;
    private String senha;

    @OneToMany(mappedBy = "owner")
    private List<Projeto> projetos;

    @OneToMany(mappedBy = "responsavel")
    private List<Tarefa> tarefas;

    @OneToMany(mappedBy = "usuario")
    private List<ChatIa> chats;
}


