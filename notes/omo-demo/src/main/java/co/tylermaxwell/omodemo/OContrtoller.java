package co.tylermaxwell.omodemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OContrtoller {
    

    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }

    @PostMapping("/handleForm")
    public String create(String number){
        System.out.println(number);
        return "redirect:/";
    }
}
