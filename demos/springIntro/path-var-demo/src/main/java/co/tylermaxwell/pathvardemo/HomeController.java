package co.tylermaxwell.pathvardemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    @GetMapping("/var/")
    public String var(@RequestParam(defaultValue = "Student") String name, @RequestParam(defaultValue = "1") Integer num){
        System.out.println(name);
        return String.format("Welcome back %s! We're glad you're okay!!", name).repeat(num);
    }

    @GetMapping("/demo/{variable}")
    public String variable(@PathVariable String variable){
        return String.format("This is my variable %s", variable);
    }
    
    
    
}
