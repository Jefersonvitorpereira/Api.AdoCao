package com.example.api.adocao.controller;

import com.example.api.adocao.dto.TutorDTO;
import com.example.api.adocao.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    @Autowired
    TutorService tutorService;

    @PostMapping
    public ResponseEntity<String> cadastrarTutor(@RequestBody TutorDTO tutorDTO) {
        tutorService.cadastrarTutor(tutorDTO);
        return ResponseEntity.ok("Tutor cadastrado com sucesso!");
    }

    @GetMapping
    public List<TutorDTO> listagemTutor(TutorDTO tutorDTO) {
        return tutorService.listagemTutor(tutorDTO);
    }


}