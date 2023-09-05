package co.tylermaxwell.sepdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired SepDemoRepository sepDemoRepository;

    @GetMapping("/")
    public String index(Model model){
        List<Stuff> stuff = (List<Stuff>) sepDemoRepository.findAll();
        System.out.println(stuff);
        return "index.jsp";
    }
}
