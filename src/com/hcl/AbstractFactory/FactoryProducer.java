package com.hcl.AbstractFactory;

public class FactoryProducer {

    public static ShoeFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Nike")){
            return new NikeFactory();
        }else if(choice.equalsIgnoreCase("Adidas")){
            return new AdidasFactory();
        }
        return null;
    }

}
