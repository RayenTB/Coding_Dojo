package com.example.devices;

public class Phone extends Device {
	
	public void MakeCall () {
		System.out.println("You make a call.");
		this.battery -= 5;
		displayBattery();
		
	}
	public void PlayGame () {
		System.out.println("you play a game.");
		this.battery -= 20;
		displayBattery();
	}
	
	public void Charge() {
		System.out.println("You charge the phone.");
		this.battery -= 50;
		if(this.battery > 100) {
			this.battery = 100;
		}
		displayBattery();
	}
	   @Override
	    public void displayBattery() {
	        super.displayBattery();
	        if (this.battery < 10) {
	            System.out.println("Battery critical!");
	        }
	    }

}
