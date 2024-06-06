package com.example.api.adocao.service;

import com.example.api.adocao.dto.TutorDTO;
import com.example.api.adocao.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public void cadastrarTutor(TutorDTO tutorDTO) {
        tutorRepository.cadastrarTutor(tutorDTO);
    }

    @GetMapping
    public List<TutorDTO> listagemTutor(TutorDTO tutorDTO) {
        return tutorRepository.listagemTutor(tutorDTO);
    }
}