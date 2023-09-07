package co.tylermaxwell.mvcdemoredo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.services.CarService;

@Controller
public class CarController {

    @Autowired CarService carService;
    
    
    //! CREATE
    @PutMapping("/cars")
    public String update(@ModelAttribute("car") Car car){
        carService.updateCar(car);
        return "redirect:/";
    }

    @GetMapping("/cars/new")
    public String newCar(@ModelAttribute("car") Car car, Model model){
        Car oldcar = new Car();
        model.addAttribute("oldcar", oldcar);
        return "new.jsp";
    }

    @PostMapping("/carsOld")
    public String createCarOld(Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    @PostMapping("/cars")
    public String createCar(@ModelAttribute("car") Car car){
        carService.addCar(car);
        System.out.println("hi Tyler");
        return "redirect:/";
    }
    
    //! READ - ALL
    @GetMapping("/")
    public String index(Model model){
        List<Car> cars = carService.getAll();
        model.addAttribute("cars", cars);
        return "index.jsp";
    }

    //! READ - ONE

    @GetMapping("/cars/{id}")
    public String show(@PathVariable Long id, Model model){
        Car car = carService.getCarById(id);
        System.out.println(car);
        model.addAttribute("car", car);
        return "show.jsp";
    }

    //! UPDATE

    @GetMapping("/cars/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        System.out.println(id);
        return "edit.jsp";
    }




    //! DELETE


}
