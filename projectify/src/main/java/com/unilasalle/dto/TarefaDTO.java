package com.unilasalle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaDTO {
    private Long idTarefa;
    private String nome;
    private String descricao;
    private String prazo;
    private String status;
    private Integer dificuldade;
    private Long projetoId;
    private Long responsavelId;
}