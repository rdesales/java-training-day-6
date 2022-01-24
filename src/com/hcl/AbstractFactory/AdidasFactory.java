package com.hcl.AbstractFactory;

public class AdidasFactory implements ShoeFactory{

    @Override
    public Shoe getShoe(String shoeType) {
        if(shoeType.equals("Tennis")){
            return new AdidasTennis();
        } else if(shoeType.equals("Boots")){
            return new AdidasBoots();
        } else if(shoeType.equals("FormalShoe")){
            return new AdidasFormalShoe();
        }
        return null;
    }
}
