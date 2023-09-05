package co.tylermaxwell.things.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.things.models.Thing;
import co.tylermaxwell.things.repositories.ThingRepository;

@Controller
public class ThingsController {

    ThingRepository thingRepository = new ThingRepository();


    //! CREATE
    @GetMapping("/things/new")
    public String newThing(Model model){
        Thing thing = new Thing();
        model.addAttribute("thing", thing);
        System.out.println(thing);
        return "new.jsp";
    }

    @PostMapping("/things")
    public String createThing(Thing thing){
        System.out.println(thing);
        thingRepository.addOne(thing);
        return "redirect:/";
    }

    //! READ ALL
    @GetMapping("/")
    public String index(Model model){
        ArrayList<Thing> things = thingRepository.getAll();
        model.addAttribute("things", things);
        return "index.jsp";
    }


    //! READ ONE
    @GetMapping("/things/{id}")
    public String show(@PathVariable String id, Model model){
        Thing thing = thingRepository.getOneById(id);
        model.addAttribute("thing", thing);
        return "show.jsp";
    }
    
    //! UPDATE
    @GetMapping("/things/{id}/edit")
    public String edit(@PathVariable String id, Model model){
        Thing thing = thingRepository.getOneById(id);
        model.addAttribute("thing", thing);
        return "edit.jsp";
    }

    @PostMapping("/things/{id}")
    public String updateThing(@PathVariable("id") String id, Thing thing){
        System.out.println(thing);
        thingRepository.update(id, thing);

        return "redirect:/";
    }

    @GetMapping("/things/{id}/destroy")
    public String destroy(){
        return "redirect:/";
    }
    

    
}
