package com.example.daikichi; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi") 
public class DaikichiController {

    @GetMapping("") 
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/today") 
    public String todayFortune() {
        return "Today you will find luck in all your endeavors!";
    }

    @GetMapping("/tomorrow") 
    public String tomorrowFortune() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @GetMapping("/travel/{city}") 
    public String travel(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }

    @GetMapping("/lotto/{number}") 
    public String lotto(@PathVariable int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}