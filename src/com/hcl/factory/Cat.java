package com.hcl.factory;

public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
