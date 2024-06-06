package com.example.api.adocao.service;

import com.example.api.adocao.dto.AdmDTO;
import com.example.api.adocao.dto.AdmListDTO;
import com.example.api.adocao.repository.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AdmService {

    @Autowired
    private AdmRepository admRepository;

    public void cadastrarAdmin(AdmDTO admDTO) {
        admRepository.cadastrarAdmin(admDTO);
    }

    @GetMapping
    public List<AdmListDTO> listagemAdm(AdmListDTO admListDTO) {
        return admRepository.listagemAdm(admListDTO);
    }
}