package me.dio.sacola.model;

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
public class Endereco {
    private String cep;
    private String complemento;
}
