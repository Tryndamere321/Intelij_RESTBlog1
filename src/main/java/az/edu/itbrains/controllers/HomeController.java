package az.edu.itbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
     public String Index(){
     return "Home";
}

@GetMapping("/contact")
public String Contact(){
        return "Contact";
}
}
