package com.hcl.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("Dog");
        animal1.run();
        animal1.makeSound();
        Animal animal2 = animalFactory.getAnimal("Cat");
        animal2.run();
        animal2.makeSound();
    }
}
