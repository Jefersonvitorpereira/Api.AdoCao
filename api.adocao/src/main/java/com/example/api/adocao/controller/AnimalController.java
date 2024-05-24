package com.example.api.adocao.controller;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.AnimalListagemDTO;
import com.example.api.adocao.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.api.adocao.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @PostMapping
    public void cadastrarAnimal(@RequestBody AnimalDTO animal) {
        animalService.inserirAnimal(animal);
    }

    @GetMapping
    public List<AnimalListagemDTO> listagemAnimal(Animal animal) {
        return animalService.listagemAnimal(animal);
    }

    @GetMapping("/especie")
    public List<AnimalListagemDTO> listagemAnimalPorEspecie(@RequestParam Long id_Especie) {
        return animalService.listagemAnimalPorEspecie(id_Especie);
    }


//    @GetMapping("/{id_Especie}")
//    public List<AnimalListagemDTO> listagemAnimal(@PathVariable Animal id_Especie) {
//        Animal animal = (Animal) animalService.listagemAnimal(id_Especie);
//        return animalService.listagemAnimal(animal);
//    }
}


