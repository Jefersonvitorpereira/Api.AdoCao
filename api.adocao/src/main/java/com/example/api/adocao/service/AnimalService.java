package com.example.api.adocao.service;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.AnimalListDTO;
import com.example.api.adocao.model.Animal;
import com.example.api.adocao.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void inserirAnimal(AnimalDTO animal) {
        animalRepository.inserirAnimal(animal);
    }

    public List<AnimalListDTO> listagemAnimal(Animal animal) {
        return animalRepository.listagemAnimal(animal);
    }

    public List<AnimalListDTO> listagemAnimalPorEspecie(Long id_Especie) {
        return animalRepository.listagemAnimalPorEspecie(id_Especie);
    }
}
