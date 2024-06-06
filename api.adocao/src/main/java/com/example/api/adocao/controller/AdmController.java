package com.example.api.adocao.controller;

import com.example.api.adocao.dto.AdmDTO;
import com.example.api.adocao.dto.AdmListDTO;
import com.example.api.adocao.service.AdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    AdmService admService;

    @PostMapping
    public ResponseEntity<String> cadastrarAdmin(@RequestBody AdmDTO admDTO) {
        admService.cadastrarAdmin(admDTO);
        return ResponseEntity.ok("Adm cadastrado com sucesso!");
    }

    @GetMapping
    public List<AdmListDTO> listagemAdm(AdmListDTO admListDTO) {
        return admService.listagemAdm(admListDTO);
    }

}