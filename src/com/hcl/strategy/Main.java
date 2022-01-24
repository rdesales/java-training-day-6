package com.hcl.strategy;


public class Main {


    public static void main(String[] args) {
        int health = 100;
            System.out.println("Health is "+health);
            Context context = new Context(new Magic());
            health = context.executeAttack(health);
            System.out.println("Health is "+health);
            context = new Context(new Punch());
            health = context.executeAttack(health);
            System.out.println("Health is "+health);
            context = new Context(new Sword());
            health = context.executeAttack(health);
            System.out.println("Health is "+health);

    }
}
