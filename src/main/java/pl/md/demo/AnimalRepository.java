package pl.md.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;

    public AnimalRepository() {
        animals = new HashSet<>();
        animals.add(new Animal("Azor", "Azor to super piesek"));
        animals.add(new Animal("Rudy", "Rudy kocur chodzi swoimi ścieżkami"));
    }

    public Animal findByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}
