package com.hcl.factory;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void makeSound() {
        System.out.println("goau goau");
    }
}
