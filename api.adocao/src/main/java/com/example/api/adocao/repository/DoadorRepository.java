package com.example.api.adocao.repository;

import com.example.api.adocao.dto.DoadorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DoadorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void cadastrarDoador(DoadorDTO doadorDTO) {
        String sql = "INSERT INTO DOADOR (VALOR, COMPROVANTE_PAGAMENTO, ID_USUARIO) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, doadorDTO.valor(), doadorDTO.comprovantePagamento(), doadorDTO.idUsuario());
    }

    public List<DoadorDTO> listagemDoador(DoadorDTO doadorDTO) {
        String sql = "SELECT VALOR, COMPROVANTE_PAGAMENTO, ID_USUARIO FROM DOADOR";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new DoadorDTO(
                        rs.getDouble("VALOR"),
                        rs.getString("COMPROVANTE_PAGAMENTO"),
                        rs.getLong("ID_USUARIO")
                )
        );
    }

}