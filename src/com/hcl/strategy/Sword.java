package com.hcl.strategy;

public class Sword implements Attack{
    private int damage = 10;

    @Override
    public int attack(int health) {
        return health - damage;
    }
}
