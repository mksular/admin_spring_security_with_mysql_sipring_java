package com.uby.admin.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uby.admin.Models.Todo;
import com.uby.admin.Services.TodoService;

@Controller
public class AdminController {
    @Autowired
    private TodoService todoService;

     /**
     * @param model
     * @return
     */
    @GetMapping("/")
    public String home(Model model) {
        String page = "home";
        List<Todo> todoList = todoService.todoList();
        model.addAttribute("page", page);
        //model.addAttribute("todoList", todoList);
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(Model model, @PathVariable(name = "page") String page) {
        model.addAttribute("page", page);
        return "index";
    }

}
