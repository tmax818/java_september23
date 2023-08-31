package co.tylermaxwell.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/world")
    public String world(){
        return "Hello Java";
    }
    
}
