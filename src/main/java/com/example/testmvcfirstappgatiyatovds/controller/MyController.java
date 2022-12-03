package com.example.testmvcfirstappgatiyatovds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String showMyFirstApp(@RequestParam(name="name",required=false, defaultValue="Word")
                                 String name,
                                 Model model)
    {
        model.addAttribute("name", name);
        return "my-first-page";
    }
}