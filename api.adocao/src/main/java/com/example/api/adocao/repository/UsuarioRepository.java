package com.example.api.adocao.repository;

import com.example.api.adocao.dto.UsuarioDTO;
import com.example.api.adocao.dto.UsuarioPorCpfDTO;
import com.example.api.adocao.dto.UsuarioPorIdDTO;
import com.example.api.adocao.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void cadastrarUsuario(UsuarioDTO usuarioDTO) {
        String sql = "INSERT INTO usuario (NOME, RG, CPF, EMAIL1, TELEFONE1) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, usuarioDTO.nome(), usuarioDTO.rg(), usuarioDTO.cpf(), usuarioDTO.email1(), usuarioDTO.telefone1());

    }

    public List<UsuarioPorIdDTO> listagemUsuario(Usuario usuario) {
        String sql = "SELECT ID, NOME, RG, CPF, EMAIL1, TELEFONE1 FROM USUARIO";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new UsuarioPorIdDTO(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("rg"),
                        rs.getString("cpf"),
                        rs.getString("email1"),
                        rs.getString("telefone1")
                )
        );
    }

    public List<UsuarioPorCpfDTO> listagemUsuarioPorCpf(String cpf) {
        String sql = "SELECT ID, NOME, RG, CPF, EMAIL1, TELEFONE1 FROM USUARIO WHERE CPF = ?";
        return jdbcTemplate.query(sql, new Object[]{cpf}, (rs, rowNum) ->
                new UsuarioPorCpfDTO(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("rg"),
                        rs.getString("cpf"),
                        rs.getString("email1"),
                        rs.getString("telefone1")
                )
        );
    }


}
