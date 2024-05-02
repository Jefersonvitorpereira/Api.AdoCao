package service;

import model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void inserirAnimal(Animal animal) {
        animalRepository.inserirAnimal(animal);
    }
}
