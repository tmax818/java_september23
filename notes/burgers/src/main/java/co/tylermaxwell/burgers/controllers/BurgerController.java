package co.tylermaxwell.burgers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BurgerController {
    

    @GetMapping("")
    public String index(){
        return "index.jsp";
    }
}
