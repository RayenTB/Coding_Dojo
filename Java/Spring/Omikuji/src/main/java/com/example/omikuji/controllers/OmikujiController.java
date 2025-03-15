package com.example.omikuji.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String showForm() {
        return "omikujiForm";
    }

    @PostMapping("/omikuji/process")
    public String processForm(@RequestParam("number") int number,
                              @RequestParam("city") String city,
                              @RequestParam("person") String person,
                              @RequestParam("hobby") String hobby,
                              @RequestParam("thing") String thing,
                              @RequestParam("message") String message,
                              HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("message", message);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showResult(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("thing", session.getAttribute("thing"));
        model.addAttribute("message", session.getAttribute("message"));
        return "omikujiResult"; 
    }
}