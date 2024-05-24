package com.example.api.adocao.service;

import com.example.api.adocao.dto.AnimalListagemDTO;
import com.example.api.adocao.model.Caes;
import com.example.api.adocao.repository.CaesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaesService {

    @Autowired
    CaesRepository caesRepository;

    public List<AnimalListagemDTO> listagemCaes(Caes caes) {
        return caesRepository.listagemCaes(caes);
    }
}
