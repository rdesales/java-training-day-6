package com.hcl.factory;

public class AnimalFactory {

    public Animal getAnimal(String animalType) {
        if(animalType.equals("Dog")) {
            return new Dog();
        } else if(animalType.equals("Cat")) {
            return new Cat();
        }
        return null;
    }
}
