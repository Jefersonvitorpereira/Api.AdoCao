package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doador {
    private Long id;
    private Double valor;
    private String comprovantePagamento;
    private Long idUsuario;
}