package com.hcl.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        System.out.println("Building Nike Factory");
        ShoeFactory shoeFactory1 = factoryProducer.getFactory("Nike");
        Shoe shoe = shoeFactory1.getShoe("Tennis");
        shoe.showShoe();

        System.out.println("Building Adidas Factory");
        ShoeFactory shoeFactory2 = factoryProducer.getFactory("Adidas");
        Shoe shoe1 = shoeFactory2.getShoe("Tennis");
        shoe1.showShoe();
    }
}
