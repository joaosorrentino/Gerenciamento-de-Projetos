package com.unilasalle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecursoDTO {
    private Long idRecurso;
    private String nome;
    private String tipo;
    private Double custo;
    private Long projetoId;
}