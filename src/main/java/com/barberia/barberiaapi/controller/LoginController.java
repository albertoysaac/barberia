package com.barberia.barberiaapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.barberia.barberiaapi.configurations.Pages;

@Controller
@RequestMapping("/login")
public class LoginController {
    
    @GetMapping
    public ModelAndView productos() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(Pages.LOGIN);
        return modelAndView;
    }

    
}
