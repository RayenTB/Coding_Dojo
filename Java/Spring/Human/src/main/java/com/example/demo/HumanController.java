package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @GetMapping("/greet")
    public String greet(
            @RequestParam(value = "first_name", defaultValue = "human") String firstName,
            @RequestParam(value = "last_name", defaultValue = "") String lastName,
            @RequestParam(value = "times", defaultValue = "1") int times) {
        
        String greetingMessage = "Hello " + firstName;
        if (!lastName.isEmpty()) {
            greetingMessage += " " + lastName;
        }

        return greetingMessage.repeat(times);
    }
}