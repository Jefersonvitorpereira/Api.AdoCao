package com.example.api.adocao.service;

import com.example.api.adocao.dto.AnimalDTO;
import com.example.api.adocao.dto.AnimalListagemDTO;
import com.example.api.adocao.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.adocao.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void inserirAnimal(AnimalDTO animal) {
        animalRepository.inserirAnimal(animal);
    }

    public List<AnimalListagemDTO> listagemAnimal(Animal animal) {
        return animalRepository.listagemAnimal(animal);
    }

    public List<AnimalListagemDTO> listagemAnimalPorEspecie(Long id_Especie) {
        return animalRepository.listagemAnimalPorEspecie(id_Especie);
    }
}
