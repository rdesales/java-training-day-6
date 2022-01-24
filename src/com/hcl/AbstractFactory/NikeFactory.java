package com.hcl.AbstractFactory;

public class NikeFactory implements ShoeFactory{

    @Override
    public Shoe getShoe(String shoeType) {
        if(shoeType.equals("Tennis")){
            return new NikeTennis();
        } else if(shoeType.equals("Boots")){
            return new NikeBoots();
        } else if(shoeType.equals("FormalShoe")){
            return new NikeFormalShoe();
        }
        return null;
    }
}
