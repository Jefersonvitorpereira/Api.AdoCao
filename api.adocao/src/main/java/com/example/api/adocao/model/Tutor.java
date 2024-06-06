package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tutor {
    private Long id;
    private String nomeAnimal;
    private String mensagem;
    private Long idUsuario;
    private String cpf;
}
