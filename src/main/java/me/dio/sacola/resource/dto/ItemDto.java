package me.dio.sacola.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder//padrao de projeto
@Data//getters and setters
@Embeddable//não vai ser tabela no banco
@NoArgsConstructor
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
