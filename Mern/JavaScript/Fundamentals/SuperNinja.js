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
    }
} 

class Sensei extends Component {
    constructor(name, health, weapon) {
        super(name, health);
        this.weapon = weapon;
        this.strength = 10;
        this.speed = 10;
      }
    }

    speakwisdom() 
    {
        console.log(this.name + " What one programmer can do in one month, two programmers can do in two months.");

    }
    showStats() 
    {
        super.showStats();
        console.log("Name: " + this.name + ", Health: " + this.health + ", Speed: " + this.speed + ", Strength: " + this.strength + ", Weapon: " + this.weapon);
    }
    
    const supersensei = new Sensei("Master Splenter");
    supersensei.speakwisdom ();
    supersensei.showStats ();