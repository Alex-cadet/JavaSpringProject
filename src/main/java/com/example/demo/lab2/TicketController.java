package com.example.demo.lab2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
public class TicketController {

    @GetMapping("/")
    public String home() {
        return "cinema";
    }     

    @GetMapping("/sheduleAdd")
    public String sheduleAdd() {
        return "sheduleAdd";
    }
    
    @PostMapping("/allShedule")
    public String allShedule() {
        return "allShedule";
    }
    
    @GetMapping("/register")
    public String register() {
        return "register";
    } 

    @GetMapping("/listFilms")
    public String listFilms() {
        return "listFilms";
    } 

    @RequestMapping(value="/cinema", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "cinema";
    }

    @RequestMapping(value="/cinema", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute @Valid Ticket ticket, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return "cinema";
        }
        model.addAttribute("ticket", ticket);
        return "ticketFilm";
    }

}
