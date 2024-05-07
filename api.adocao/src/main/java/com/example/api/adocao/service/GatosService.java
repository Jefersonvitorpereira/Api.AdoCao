package com.example.api.adocao.service;

import com.example.api.adocao.dto.GatosDTO;
import com.example.api.adocao.model.Gatos;
import com.example.api.adocao.repository.GatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatosService {

    @Autowired
    GatosRepository gatosRepository;

        public List<GatosDTO> listagemGatos(Gatos gatos) {
       return gatosRepository.listagemGatos(gatos);
    }
}
