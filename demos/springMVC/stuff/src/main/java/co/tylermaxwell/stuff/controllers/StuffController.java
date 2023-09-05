package co.tylermaxwell.stuff.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.stuff.models.Stuff;
import co.tylermaxwell.stuff.repositories.StuffRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class StuffController {

    @Autowired StuffRepository stuffRepository;
    
    // route that renders
    @GetMapping("/")
    public String index(Model model){
        stuffRepository.findAll();
        return "index.jsp";
    }

    // handle form data
    @PostMapping("/handleForm")
    public String handleForm(String title, HttpSession session){
        System.out.println(title);
        session.setAttribute("title", title );
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String show(){
        return "show.jsp";
    }
}
