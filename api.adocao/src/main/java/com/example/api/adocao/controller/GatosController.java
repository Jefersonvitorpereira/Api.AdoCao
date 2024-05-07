package com.example.api.adocao.controller;

import com.example.api.adocao.dto.CaesDTO;
import com.example.api.adocao.dto.GatosDTO;
import com.example.api.adocao.model.Caes;
import com.example.api.adocao.model.Gatos;
import com.example.api.adocao.service.CaesService;
import com.example.api.adocao.service.GatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gatos")
public class GatosController {

    @Autowired
    GatosService gatosService;

    @GetMapping
    public List<GatosDTO> listagemGatos(Gatos gatos){

       return gatosService.listagemGatos(gatos);
    }


}


