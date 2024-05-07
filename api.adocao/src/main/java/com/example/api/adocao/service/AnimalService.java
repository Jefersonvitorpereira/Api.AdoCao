package com.example.api.adocao.service;

import com.example.api.adocao.dto.AnimalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.adocao.repository.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void inserirAnimal(AnimalDTO animal) {
        animalRepository.inserirAnimal(animal);
    }
}
