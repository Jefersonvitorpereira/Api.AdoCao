package model;

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
    private Long IdadeAno;
    private Long IdadeMes;
    private String CorPelo;
    private String PorteTamanho;
    private String Pelagem;
    private String Castrado;
    private String Vermifugacao;
    private String Vacinas;
    private String Disponibilidade;
    private String InfoAdicionais;
    private String Raca;
    private String Sexo;
    private String Especie;
    private String Fotos;

}
