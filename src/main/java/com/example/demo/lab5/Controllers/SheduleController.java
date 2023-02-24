package com.example.demo.lab5.Controllers;
import org.springframework.stereotype.Controller;

import com.example.demo.lab5.CassandraModel.Shedule;
import com.example.demo.lab5.CassandraModel.SheduleForm;
import com.example.demo.lab5.CassandraModel.SheduleToSheduleForm;
import com.example.demo.lab5.Service.SheduleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
// import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


@Controller
public class SheduleController {

    private SheduleService sheduleService;
    private SheduleToSheduleForm sheduleToSheduleForm;

    public void setSheduleService(SheduleService sheduleService) {
        this.sheduleService = sheduleService;
    }

    public void setSheduleToSheduleForm(@Valid SheduleToSheduleForm sheduleToSheduleForm) {
        this.sheduleToSheduleForm = sheduleToSheduleForm;
    }

    @GetMapping("/allShedule")
    public String allShedule(Model model){
        model.addAttribute("shedule", sheduleService.listAll());
        return "allShedule";
    }

    @GetMapping("/FormShedule")
    public String newShedule(Model model){
        model.addAttribute("sheduleForm", new SheduleForm());
        return "FormShedule";
    }
    
    @RequestMapping(value="/FormShedule", method=RequestMethod.POST)
    public String saveOrUpdateShedule(@Valid SheduleForm sheduleForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "FormShedule";
        }
        Shedule savedShedule = sheduleService.saveOrUpdateSheduleForm(sheduleForm);
        return "redirect:/allShedule"+savedShedule.getId();

    }
}
