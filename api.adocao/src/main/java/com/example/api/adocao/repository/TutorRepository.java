package com.example.api.adocao.repository;

import com.example.api.adocao.dto.TutorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TutorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void cadastrarTutor(TutorDTO tutorDTO) {
        String sql = "INSERT INTO TUTOR (NOME_ANIMAL, MENSAGEM, ID_USUARIO, CPF) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, tutorDTO.nomeAnimal(), tutorDTO.mensagem(), tutorDTO.idUsuario(), tutorDTO.cpf());
    }

    public List<TutorDTO> listagemTutor(TutorDTO tutorDTO) {
        String sql = "SELECT NOME_ANIMAL, MENSAGEM, ID_USUARIO, CPF FROM TUTOR";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new TutorDTO(
                        rs.getString("NOME_ANIMAL"),
                        rs.getString("MENSAGEM"),
                        rs.getLong("ID_USUARIO"),
                        rs.getString("CPF")
                )
        );
    }

}