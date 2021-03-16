package pl.md.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;

    public AnimalRepository() {
        animals = new HashSet<>();
        animals.add(new Animal("Azor", "Azor to super piesek", "/azor.jpg"));
        animals.add(new Animal("Rudy", "Rudy kocur chodzi swoimi ścieżkami", "https://a.allegroimg.com/original/1212b0/f00c51784b3d8b6318d17d96f770"));
        animals.add(new Animal("Osioł", "Opis osła", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTe83GBki6SvxFibOLDYc7HszwrKPgGAwNWCg&usqp=CAU"));
        animals.add(new Animal("Koń", "Opis konia", "https://1.bp.blogspot.com/-yDHmWxhGr1c/WTgwTe84GHI/AAAAAAAABTo/NfyR_L2lxE4A-OVriXvq14gHSX7AKdhCQCLcB/s1600/mold-2292161_1920.jpg"));
    }

    public Animal findByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public Set<Animal> findAll() {
        return animals;
    }
}
