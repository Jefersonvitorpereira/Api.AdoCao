package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Padrinho {
    private Long id;
    private Double planoValor;
    private String nomeAnimal;
    private Long idUsuario;
    private Long periodoMeses;
    private String cpf;
}