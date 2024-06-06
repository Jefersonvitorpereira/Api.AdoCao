package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal {
    private Long id;
    private String nome;
    private Long idadeAno;
    private Long idadeMes;
    private String corPelo;
    private String porteTamanho;
    private String pelagem;
    private String castrado;
    private String vermifugacao;
    private String vacinas;
    private String disponibilidade;
    private String infoAdicionais;
    private String sexo;
    private String especie;
    private String fotos;
}
