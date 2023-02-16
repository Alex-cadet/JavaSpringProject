package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "greeting";
    } 
    
    @GetMapping("/listFilms")
    public String listFilms() {
        return "listFilms";
    }  
    
    @GetMapping("/ticketResult")
    public String ticketResult() {
        return "ticketResult";
    } 
}
