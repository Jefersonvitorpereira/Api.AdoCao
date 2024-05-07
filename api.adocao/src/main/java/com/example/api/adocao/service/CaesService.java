package com.example.api.adocao.service;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.CaesDTO;
import com.example.api.adocao.model.Animal;
import com.example.api.adocao.model.Caes;
import com.example.api.adocao.repository.CaesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaesService {

    @Autowired
    CaesRepository caesRepository;

        public List<CaesDTO> listagemCaes(Caes caes) {
       return caesRepository.listagemCaes(caes);
    }
}
