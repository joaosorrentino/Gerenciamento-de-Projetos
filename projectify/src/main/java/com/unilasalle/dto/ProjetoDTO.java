package com.unilasalle.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoDTO {
    private Long idProjeto;
    private String nome;
    private String descricao;
    private String prazo;
    private Long ownerId; // id do dono (usuario)
}
