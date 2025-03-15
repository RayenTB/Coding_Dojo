package com.example.zookeeper;

public class Bat extends Mammal {

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        System.out.println("The bat is airborne!");
        this.energy -= 50;
        displayEnergy();
    }

    public void eatHumans() {
        System.out.println("The bat is satisfied after eating humans.");
        this.energy += 25;
        displayEnergy();
    }

    public void attackTown() {
        System.out.println("The bat is attacking the town!");
        this.energy -= 100;
        displayEnergy();
    }
}