package com.example.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Animal;
import com.example.demo.repositories.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> getAllAnimal() {
		return animalRepository.findAll();
	}
	
	public Animal saveAnimal(Animal animal) {
		return animalRepository.save(animal);
	}
	
	public Animal getAnimalById(Long id) {
		return animalRepository.findById(id).orElse(null);
	}
	
	public void deleteAnimal(Long id) {
		animalRepository.deleteById(id);
	}


}
