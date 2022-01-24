package com.hcl.strategy;

public class Punch implements Attack{
    private int punchDamage = 30;

    @Override
    public int attack(int health) {
        return health - punchDamage;
    }
}
