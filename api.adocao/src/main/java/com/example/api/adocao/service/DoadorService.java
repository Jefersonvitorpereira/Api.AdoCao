package com.example.api.adocao.service;

import com.example.api.adocao.dto.DoadorDTO;
import com.example.api.adocao.repository.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DoadorService {

    @Autowired
    private DoadorRepository doadorRepository;

    public void cadastrarDoador(DoadorDTO doadorDTO) {
        doadorRepository.cadastrarDoador(doadorDTO);
    }

    @GetMapping
    public List<DoadorDTO> listagemDoador(DoadorDTO doadorDTO) {
        return doadorRepository.listagemDoador(doadorDTO);
    }
}