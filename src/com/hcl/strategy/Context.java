package com.hcl.strategy;

public class Context {
    private Attack attack;

    public Context(Attack attack) {
        this.attack = attack;
    }

    public int executeAttack(int health) {
        return attack.attack(health);
    }
}
