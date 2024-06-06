package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private Long id;
    private String nome;
    private String rg;
    private String cpf;
    private String email1;
    private String email2;
    private String telefone1;
    private String telefone2;
}
