package com.example.api.adocao.controller;

import com.example.api.adocao.dto.PadrinhoDTO;
import com.example.api.adocao.service.PadrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/padrinho")
public class PadrinhoController {

    @Autowired
    PadrinhoService padrinhoService;

    @PostMapping
    public ResponseEntity<String> cadastrarPadrinho(@RequestBody PadrinhoDTO padrinhoDTO) {
        padrinhoService.cadastrarPadrinho(padrinhoDTO);
        return ResponseEntity.ok("Padrinho cadastrado com sucesso!");
    }

    @GetMapping
    public List<PadrinhoDTO> listagemPadrinho(PadrinhoDTO padrinhoDTO) {
        return padrinhoService.listagemPadrinho(padrinhoDTO);
    }

}