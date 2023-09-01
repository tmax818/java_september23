package co.tylermaxwell.pathvariables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVarsController {
    
    @GetMapping("/{var}/")
    public String var (@PathVariable String var, String name){

        return String.format("Hello %s this is the var %s", name, var);
    }
}
