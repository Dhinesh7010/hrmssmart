package com.meganar.smarthrms.InternalMobility.controller;

import com.meganar.smarthrms.InternalMobility.model.NewOpenings;
import com.meganar.smarthrms.InternalMobility.service.NewOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class NewOpeningController {

   private NewOpeningService newOpeningService;
   @Autowired
    NewOpeningController(NewOpeningService theNewOpeingService){
        newOpeningService=theNewOpeingService;
    }
    @RequestMapping("/addNewOpening")
    public String newOpeingForm(Model model){
        NewOpenings newOpenings=new NewOpenings();
        model.addAttribute("openings",newOpenings);
       return "newOpening";
    }
    @PostMapping("/newOpeningSave")
    public String saveDetails(@ModelAttribute("openings")NewOpenings theNewopening){
       theNewopening.setId(0);
        System.out.println("entry"+theNewopening.getJobTitle());
       newOpeningService.save(theNewopening);
       return"redirect:/new/addNewOpening";
    }


}
