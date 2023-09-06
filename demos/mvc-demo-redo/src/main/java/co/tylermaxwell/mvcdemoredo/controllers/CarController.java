package co.tylermaxwell.mvcdemoredo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.services.CarService;

@Controller
public class CarController {

    @Autowired CarService carService;
    

    //! CREATE

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

    //! DELETE


}
