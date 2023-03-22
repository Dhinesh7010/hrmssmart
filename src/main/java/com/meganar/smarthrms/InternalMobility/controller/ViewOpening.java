package com.meganar.smarthrms.InternalMobility.controller;

import com.meganar.smarthrms.InternalMobility.service.NewOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewOpening {
    private NewOpeningService newOpeningService;
    @Autowired
    ViewOpening(NewOpeningService theNewOpeningService){
        newOpeningService=theNewOpeningService;
    }
    @RequestMapping("/view")
    public String getFullDetails(){
        return " ";
    }

}
