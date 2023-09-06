package co.tylermaxwell.mvcdemoredo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        System.out.println(cars);
        model.addAttribute("cars", cars);
        return "index.jsp";
    }

    //! READ - ONE

    //! UPDATE

    //! DELETE


}
