package az.edu.itbrains.controllers;

import az.edu.itbrains.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CategoryController {



    @GetMapping("/admin/category")
    public String dashboardCategory(){
        return "/admin/category/index";
    }



    @GetMapping("/admin/category/add")
    public String createCategory(){
        return "/admin/category/create";
    }
}
