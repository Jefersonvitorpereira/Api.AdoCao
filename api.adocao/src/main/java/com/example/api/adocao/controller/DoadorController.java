package com.example.api.adocao.controller;

import com.example.api.adocao.dto.DoadorDTO;
import com.example.api.adocao.service.DoadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doador")
public class DoadorController {

    @Autowired
    DoadorService doadorService;

    @PostMapping
    public ResponseEntity<String> cadastrarDoador(@RequestBody DoadorDTO doadorDTO) {
        doadorService.cadastrarDoador(doadorDTO);
        return ResponseEntity.ok("Doador cadastrado com sucesso!");
    }

    @GetMapping
    public List<DoadorDTO> listagemDoador(DoadorDTO doadorDTO) {
        return doadorService.listagemDoador(doadorDTO);
    }


}