package com.example.api.adocao.service;

import com.example.api.adocao.dto.PadrinhoDTO;
import com.example.api.adocao.repository.PadrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PadrinhoService {

    @Autowired
    private PadrinhoRepository padrinhoRepository;

    public void cadastrarPadrinho(PadrinhoDTO padrinhoDTO) {
        padrinhoRepository.cadastrarPadrinho(padrinhoDTO);
    }

    @GetMapping
    public List<PadrinhoDTO> listagemPadrinho(PadrinhoDTO padrinhoDTO) {
        return padrinhoRepository.listagemPadrinho(padrinhoDTO);
    }
}