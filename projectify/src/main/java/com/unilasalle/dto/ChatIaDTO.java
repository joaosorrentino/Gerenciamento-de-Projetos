package com.unilasalle.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatIaDTO {
    private Long idChat;
    private String pergunta;
    private String resposta;
    private LocalDateTime dtRequisicao;
    private Long usuarioId;
}