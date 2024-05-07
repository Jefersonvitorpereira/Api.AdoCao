package com.example.api.adocao.repository;

import com.example.api.adocao.dto.AnimalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void inserirAnimal(AnimalDTO animal) {
        String sql = "INSERT INTO animal (NOME, IDADE_ANO, IDADE_MES, COR_PELO, PORTE_TAMANHO, PELAGEM, CASTRADO, DISPONIBILIDADE, SEXO, ID_ESPECIE  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, animal.nome(), animal.idadeAno(), animal.idadeMes(), animal.corPelo(), animal.porteTamanho(), animal.pelagem(), animal.castrado(), animal.disponibilidade(), animal.sexo(), animal.especie());
    }
}
