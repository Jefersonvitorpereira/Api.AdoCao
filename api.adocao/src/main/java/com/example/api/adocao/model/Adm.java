package com.example.api.adocao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Adm {
    private Long id;
    private String usuario;
    private String senha;
    private Long idUsuario;
}
