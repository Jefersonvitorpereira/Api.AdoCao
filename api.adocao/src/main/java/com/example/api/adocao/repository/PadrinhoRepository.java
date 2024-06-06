package com.example.api.adocao.repository;

import com.example.api.adocao.dto.PadrinhoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PadrinhoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void cadastrarPadrinho(PadrinhoDTO padrinhoDTO) {
        String sql = "INSERT INTO PADRINHO (PLANO_VALOR, NOME_ANIMAL, ID_USUARIO, PERIODO_MESES, CPF) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, padrinhoDTO.planoValor(), padrinhoDTO.nomeAnimal(), padrinhoDTO.idUsuario(), padrinhoDTO.periodoMeses(), padrinhoDTO.cpf());
    }

    public List<PadrinhoDTO> listagemPadrinho(PadrinhoDTO padrinhoDTO) {
        String sql = "SELECT PLANO_VALOR, NOME_ANIMAL, ID_USUARIO, PERIODO_MESES, CPF FROM PADRINHO";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new PadrinhoDTO(
                        rs.getDouble("PLANO_VALOR"),
                        rs.getString("NOME_ANIMAL"),
                        rs.getLong("ID_USUARIO"),
                        rs.getLong("PERIODO_MESES"),
                        rs.getString("CPF")
                )
        );
    }

}