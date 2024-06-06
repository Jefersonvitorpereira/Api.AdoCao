package com.example.api.adocao.repository;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.AnimalListDTO;
import com.example.api.adocao.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void inserirAnimal(AnimalDTO animal) {
        String sql = "INSERT INTO animal (NOME, IDADE_ANO, IDADE_MES, COR_PELO, PORTE_TAMANHO, PELAGEM, CASTRADO, DISPONIBILIDADE, SEXO, ID_ESPECIE  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, animal.nome(), animal.idadeAno(), animal.idadeMes(), animal.corPelo(), animal.porteTamanho(), animal.pelagem(), animal.castrado(), animal.disponibilidade(), animal.sexo(), animal.especie());
    }

    public List<AnimalListDTO> listagemAnimal(Animal animal) {
        String sql = "SELECT id, nome, idade_Ano, idade_Mes, cor_Pelo, porte_Tamanho, pelagem, castrado, disponibilidade, sexo FROM ANIMAL ";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new AnimalListDTO(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getLong("idade_Ano"),
                        rs.getLong("idade_Mes"),
                        rs.getString("cor_Pelo"),
                        rs.getString("porte_Tamanho"),
                        rs.getString("pelagem"),
                        rs.getString("castrado"),
                        rs.getString("disponibilidade"),
                        rs.getString("sexo")
                )
        );
    }

    public List<AnimalListDTO> listagemAnimalPorEspecie(Long id_Especie) {
        String sql = "SELECT id, nome, idade_Ano, idade_Mes, cor_Pelo, porte_Tamanho, pelagem, castrado, disponibilidade, sexo FROM ANIMAL";

        // Adiciona a condição WHERE se id_Especie for fornecido
        if (id_Especie != null) {
            sql += " WHERE id_Especie = ?";
            return jdbcTemplate.query(sql, new Object[]{id_Especie}, (rs, rowNum) ->
                    new AnimalListDTO(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            rs.getLong("idade_Ano"),
                            rs.getLong("idade_Mes"),
                            rs.getString("cor_Pelo"),
                            rs.getString("porte_Tamanho"),
                            rs.getString("pelagem"),
                            rs.getString("castrado"),
                            rs.getString("disponibilidade"),
                            rs.getString("sexo")
                    )
            );
        } else {
            return jdbcTemplate.query(sql, (rs, rowNum) ->
                    new AnimalListDTO(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            rs.getLong("idade_Ano"),
                            rs.getLong("idade_Mes"),
                            rs.getString("cor_Pelo"),
                            rs.getString("porte_Tamanho"),
                            rs.getString("pelagem"),
                            rs.getString("castrado"),
                            rs.getString("disponibilidade"),
                            rs.getString("sexo")
                    )
            );
        }
    }

}
