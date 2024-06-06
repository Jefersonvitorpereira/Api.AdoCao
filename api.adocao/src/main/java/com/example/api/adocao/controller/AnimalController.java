package com.example.api.adocao.controller;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.AnimalListDTO;
import com.example.api.adocao.model.Animal;
import com.example.api.adocao.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @PostMapping
    public ResponseEntity<String> cadastrarAnimal(@RequestBody AnimalDTO animal) {
        animalService.inserirAnimal(animal);
        return ResponseEntity.ok("Animal cadastrado com sucesso!");
    }

    @GetMapping
    public List<AnimalListDTO> listagemAnimal(Animal animal) {
        return animalService.listagemAnimal(animal);
    }

    @GetMapping("/especie")
    public List<AnimalListDTO> listagemAnimalPorEspecie(@RequestParam Long id_Especie) {
        return animalService.listagemAnimalPorEspecie(id_Especie);
    }

}


