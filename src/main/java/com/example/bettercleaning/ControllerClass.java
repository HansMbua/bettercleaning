package com.example.bettercleaning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
@Controller
public class ControllerClass  {
    String appName = "Cleaning";

    @GetMapping("/")
    public String HomePage(Model model){
        model.addAttribute("appName",appName);
        return "index";

    }

}
