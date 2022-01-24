package com.hcl.strategy;

public class Magic implements Attack{
    private int damage = 50;

    @Override
    public int attack(int health) {
        return health - damage;
    }
}

