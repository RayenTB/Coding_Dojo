class Ninja {
    constructor(name, health) {
        this.name = name;
        this.health = health;
        this.speed = 10;
        this.strength = 10;
    }
    sayName() {
        console.log(this.name);
    }
    showStats() {
        console.log("Name: " + this.name + ", Health: " + this.health + ", Speed: " + this.speed + ", Strength: " + this.strength);
    }
    drinkSake() {
        this.health += 10;
        console.log(this.name + " drank a sake and gained 10 health points.");
    }
} 
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake();
