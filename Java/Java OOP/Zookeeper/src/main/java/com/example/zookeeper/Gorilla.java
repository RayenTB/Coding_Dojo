package com.example.zookeeper;

	public class Gorilla extends Mammal {
	    public void throwSomething() {
	        System.out.println("The gorilla has thrown something!");
	        this.energy -= 5;
	        displayEnergy();
	    }

	    public void eatBananas() {
	        System.out.println("The gorilla is satisfied after eating bananas.");
	        this.energy += 10;
	        displayEnergy();
	    }

	    public void climb() {
	        System.out.println("The gorilla has climbed a tree!");
	        this.energy -= 10;
	        displayEnergy();
	    }
}
