
//? Part I: Code Your Duel

const { model } = require("mongoose");

//! Creeate a class for Unit Card
class UnitCard {
    //* constructor
    constructor(name, cost, power, resilience) {
        this.name = name;  //* initialize name property
        this.cost = cost;  //* initialize cost property
        this.power = power;  //* initialize power property
        this.resilience = resilience;  //* initialize resilience property
    }

    //* method to display info about unit cards
    // * Baltique: ALT GRD + 7(top) => Interpolation: ${}
    displayInfo() {
        console.log(`Unit Card Info : ${this.name}\n${this.cost}\n${this.power}\n${this.resilience}`)
    }
    attack(target){
        console.log(`${this.name} attacks ${target.name}`)
        target.resilience = target.resilience - this.power
        if (target.resilience <= 0) {
            console.log(`${target.name} is defeated!`)
        }
        else {
            console.log(`${target.name} remaining resilience is ${target.resilience}`)
        }
    }
}

class EffectCards{
    //* constructor
    constructor(name, cost, desc, stat, magnitude){
        this.name = name;  //* initialize name property
        this.cost = cost;  //* initialize cost property
        this.desc = desc;  //* initialize desc property
        this.stat = stat;  //* initialize stat property
        this.magnitude = magnitude;  //* initialize magnitude property
    }

    //* method to apply effect on a unit card
    applyEFfect(target){
        console.log(`${this.name} is applied to ${target.name}`)
        if(this.stat === "Power"){
            target.power = target.power + this.magnitude
            console.log(`${target.name}'s power is now ${target.power}`)
        } else if(this.stat === "Resilience"){
            target.resilience = target.resilience + this.magnitude
            console.log(`${target.name}'s resilience is now ${target.resilience}`)
        }
    }
}

//* Create instances of UnitCards
const GreenBeltNinja = new UnitCard("Green Belt Ninja", 2, 4, 3)
const YellowBeltNinja = new UnitCard("Yellow Belt Ninja", 3, 5, 2)
// GreenBeltNinja.displayInfo()
//* Create instances of EffectCards
const refactorCode = new EffectCards("Refactor Code", 1, "Increase target's power by 3", "Power", 3)
const mergeConflict = new EffectCards("Merge Conflict", 2, "Reduce target's resilience by 2", "Resilience", -2)
//* Green Belt Ninja attacks Yellow Belt Ninja
GreenBeltNinja.attack(YellowBeltNinja) 
console.log("****************************************************************************************************")
//* Play out the scenario
console.log("Scenario begins ...\n")

//* Apply the **Refactor Code** effect.
refactorCode.applyEFfect(GreenBeltNinja);
console.log("****************************************************************************************************")
//* Apply **Merge Conflict** on  **Yellow Belt Ninja** .
mergeConflict.applyEFfect(YellowBeltNinja)
console.log("****************************************************************************************************")

//? Using .map() and .filter()
const cars = Object.freeze([
    { 
      "id": 1, 
      name: "Tesla Model 3", 
      year: 2020, 
      price: 35000, 
      type: "electric", 
      brand: ["Tesla", "Tesla Motors", "Tesla Inc."] 
    },
    { 
      "id": 2, 
      name: "BMW 3 Series", 
      year: 2018, 
      price: 40000, 
      type: "gasoline", 
      brand: ["BMW", "Bayerische Motoren Werke"] 
    },
    { 
      "id": 3, 
      name: "Audi A4", 
      year: 2019, 
      price: 37000, 
      type: "gasoline", 
      brand: ["Audi", "Volkswagen Group", "VAG"] 
    },
    { 
      "id": 4, 
      name: "Nissan Leaf", 
      year: 2021, 
      price: 30000, 
      type: "electric", 
      brand: ["Nissan", "Nissan Motor Co."] 
    },
    { 
      "id": 5, 
      name: "Ford Mustang", 
      year: 2022, 
      price: 55000, 
      type: "gasoline", 
      brand: ["Ford", "Ford Motor Company", "Ford USA"] 
    },
    { 
      "id": 6, 
      name: "Chevrolet Bolt", 
      year: 2020, 
      price: 32000, 
      type: "electric", 
      brand: ["Chevrolet", "General Motors"] 
    },
    { 
      "id": 7, 
      name: "Mercedes C-Class", 
      year: 2021, 
      price: 42000, 
      type: "gasoline", 
      brand: ["Mercedes", "Daimler AG", "Mercedes-Benz"] 
    }
  ]);

//? Challenge 1:
//!Task 1 : Create an array of car objects that only includes the id, name, and the number of brands (the length of the brand array) for each car.
const carIdsAndBrandsCount = cars.map((oneCar => ({
    id: oneCar.id,
    name: oneCar.name,
    brandCount: oneCar.brand.length
})))

console.log("This is all cars with only the id - name and the length of brand\n",carIdsAndBrandsCount)

/*

{ 
      "id": 7, 
      name: "Mercedes C-Class", 
      year: 2021, 
      price: 42000, 
      type: "gasoline", 
      brand: ["Mercedes", "Daimler AG", "Mercedes-Benz"] 
}

    */   
console.log("****************************************************************************************************")

//! Task 2: Create an array of electric car names and their first brand.
const electricCarNamesAndFirstBrand = cars.filter(oneCar => oneCar.type === "electric").map(oneCar => ({
    name: oneCar.name,
    firstBrand: oneCar.brand[0]
}))

console.log("An array of electric car names and First Brand Collection :\n", electricCarNamesAndFirstBrand)
console.log("****************************************************************************************************")
//! Task 3 : Create an array of objects representing the cars with a price greater than $40,000.
const expensiveCars = cars.filter(oneCar => oneCar.price >= 40000);
console.log("All cars with the price greater than 40000$ are:\n",expensiveCars)
console.log("****************************************************************************************************")

//! Task 4 : Create an array of objects that includes only the electric type cars.
const electricCars = cars.filter(oneCar => oneCar.type === "electric")
console.log("All electircs cars are:\n", electricCars)
console.log("****************************************************************************************************")

//! Task 5: Find all the cars whose name contains the word "Model"
const modelCars = cars.filter(oneCar => oneCar.name.includes("Model"));
console.log(modelCars)
console.log("****************************************************************************************************")

//! Task 6: Create an array of the names of cars that are electric and cost less than $35,000.
const affordableElectricCarNames = cars.filter(oneCar => oneCar.type === "electric" && oneCar.price <= 35000)
.map(oneCar => oneCar.name)
console.log(affordableElectricCarNames)
console.log("****************************************************************************************************")

//! Task 7: Create an array of objects that includes the `id` and `name` of cars manufactured after 2019, along with a boolean indicating if they are electric.
const recentElectricCars = cars.filter(oneCar => oneCar.year > 2019).map(oneCar => ({
    id: oneCar.id,
    name: oneCar.name,
    isElectric: oneCar.type === "electric"
}))

console.log(recentElectricCars)
console.log("****************************************************************************************************")

//! Task 8: Find the total number of gasoline cars and return an array of objects containing their names and prices.
const gasolineCars = cars.filter(oneCar => oneCar.type === "gasoline")
const gasolineCarsSummary = gasolineCars.map(oneCar => ({
    name: oneCar.name,
    price: oneCar.price
}))

console.log(gasolineCarsSummary)