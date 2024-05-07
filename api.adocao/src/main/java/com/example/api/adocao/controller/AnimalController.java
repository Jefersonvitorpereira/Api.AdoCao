package com.example.api.adocao.controller;

import com.example.api.adocao.dto.AnimalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.adocao.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @PostMapping
    public void cadastrarAnimal(@RequestBody AnimalDTO animal){
        animalService.inserirAnimal(animal);
    }
}

