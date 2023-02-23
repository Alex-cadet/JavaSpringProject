package com.example.demo.Controllers;
import org.springframework.stereotype.Controller;
import com.example.demo.CassandraModel.Shedule;
import com.example.demo.CassandraModel.SheduleForm;
import com.example.demo.CassandraModel.SheduleToSheduleForm;
import com.example.demo.Service.SheduleService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;


@Controller
public class SheduleController {

    private SheduleService sheduleService;
    private SheduleToSheduleForm sheduleToSheduleForm;

    public void setSheduleService(SheduleService sheduleService) {
        this.sheduleService = sheduleService;
    }

    public void setSheduleToSheduleForm(SheduleToSheduleForm sheduleToSheduleForm) {
        this.sheduleToSheduleForm = sheduleToSheduleForm;
    }

    @RequestMapping("/sheduleAdd")
    public String newShedule(Model model){
        model.addAttribute("sheduleForm", new SheduleForm());
        return "sheduleAdd";
    }
    
    @RequestMapping(value = "/sheduleAdd", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid SheduleForm sheduleForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "/sheduleAdd";
        }

        Shedule savedShedule = sheduleService.saveOrUpdateSheduleForm(sheduleForm);

        return "/allShedule" + savedShedule.getId();
    }
}
