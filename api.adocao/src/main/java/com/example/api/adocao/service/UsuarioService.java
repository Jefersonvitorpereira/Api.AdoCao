package com.example.api.adocao.service;

import com.example.api.adocao.dto.UsuarioDTO;
import com.example.api.adocao.dto.UsuarioPorCpfDTO;
import com.example.api.adocao.dto.UsuarioPorIdDTO;
import com.example.api.adocao.model.Usuario;
import com.example.api.adocao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(UsuarioDTO usuarioDTO) {
        usuarioRepository.cadastrarUsuario(usuarioDTO);
    }

    public List<UsuarioPorIdDTO> listagemUsuario(Usuario usuario) {
        return usuarioRepository.listagemUsuario(usuario);
    }

    public List<UsuarioPorCpfDTO> listagemUsuarioPorCpf(String cpf) {
        return usuarioRepository.listagemUsuarioPorCpf(cpf);
    }
}
