package com.example.api.adocao.repository;

import com.example.api.adocao.dto.GatosDTO;
import com.example.api.adocao.model.Gatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GatosRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<GatosDTO> listagemGatos(Gatos gatos) {
        String sql = "SELECT id, nome, idade_Ano, idade_Mes, cor_Pelo, porte_Tamanho, pelagem, castrado, disponibilidade, sexo FROM ANIMAL WHERE ID_ESPECIE = 2";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new GatosDTO(
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
