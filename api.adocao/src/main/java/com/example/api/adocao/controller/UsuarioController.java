package com.example.api.adocao.controller;

import com.example.api.adocao.dto.UsuarioDTO;
import com.example.api.adocao.dto.UsuarioPorCpfDTO;
import com.example.api.adocao.dto.UsuarioPorIdDTO;
import com.example.api.adocao.model.Usuario;
import com.example.api.adocao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.cadastrarUsuario(usuarioDTO);
        return ResponseEntity.ok("Usuário cadastrado com sucesso!");
    }

    @GetMapping
    public List<UsuarioPorIdDTO> listagemUsuario(Usuario usuario) {
        return usuarioService.listagemUsuario(usuario);
    }

    @GetMapping("/cpf")
    public List<UsuarioPorCpfDTO> listagemUsuarioPorCpf(@RequestParam String cpf) {
        return usuarioService.listagemUsuarioPorCpf(cpf);
    }
}
