package com.example.api.adocao.repository;

import com.example.api.adocao.dto.AdmDTO;
import com.example.api.adocao.dto.AdmListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdmRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void cadastrarAdmin(AdmDTO admDTO) {
        String sql = "INSERT INTO administrador (USUARIO, SENHA, ID_USUARIO) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, admDTO.usuario(), admDTO.senha(), admDTO.idUsuario());
    }

    public List<AdmListDTO> listagemAdm(AdmListDTO admListDTO) {
        String sql = "SELECT usuario, senha FROM Administrador";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new AdmListDTO(
                        rs.getString("usuario"),
                        rs.getString("senha")
                )
        );
    }

}