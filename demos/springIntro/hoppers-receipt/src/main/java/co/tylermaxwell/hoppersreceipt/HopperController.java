package co.tylermaxwell.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HopperController {
    
    @GetMapping("/")
    public String index(Model model) {
        

        Receipt receipt = new Receipt("Grace Hopper", "copper wire", 5.25, "wire to illustrate nanoseconds", "Home Depot");
   
        model.addAttribute("receipt", receipt);
    
        return "index.jsp";
    }
    //...
    



    
}
