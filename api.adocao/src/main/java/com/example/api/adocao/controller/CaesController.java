package com.example.api.adocao.controller;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.CaesDTO;
import com.example.api.adocao.model.Caes;
import com.example.api.adocao.service.CaesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/caes")
public class CaesController {

    @Autowired
    CaesService caesService;

    @GetMapping
    public List<CaesDTO> listagemCaes(Caes caes){

       return caesService.listagemCaes(caes);
    }


}


