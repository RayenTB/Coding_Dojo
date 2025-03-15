package com.example.devices;

public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        // Perform actions on the phone
        myPhone.MakeCall(); // First call
        myPhone.MakeCall(); // Second call
        myPhone.MakeCall(); // Third call
        myPhone.PlayGame(); // First game
        myPhone.PlayGame(); // Second game
        myPhone.Charge();   // Charge the phone
    }
}