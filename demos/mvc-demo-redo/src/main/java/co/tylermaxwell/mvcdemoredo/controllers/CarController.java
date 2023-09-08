package co.tylermaxwell.mvcdemoredo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.models.Driver;
import co.tylermaxwell.mvcdemoredo.services.CarService;
import co.tylermaxwell.mvcdemoredo.services.DriverService;
import jakarta.validation.Valid;

@Controller
public class CarController {

    @Autowired CarService carService;

    @Autowired DriverService driverService;
    
    
    //! CREATE

    @GetMapping("/cars/new")
    public String newCar(@ModelAttribute Car car, Model model){
        List<Driver> drivers = driverService.getAllDrivers();
        model.addAttribute("drivers", drivers);
        return "new.jsp";
    }


    @PostMapping("/cars")
    public String createCar(@Valid @ModelAttribute("car") Car car, BindingResult result){
        if(result.hasErrors()){
            return "new.jsp";
        } else {
            // System.out.println(car.getDriver().getId());
            carService.addCar(car);
            return String.format("redirect:/drivers/%d",car.getDriver().getId() );
        }


    }
    

    @GetMapping("/drivers/{id}")
    public String showDriver(@PathVariable Long id, Model model){
        Driver driver = driverService.getOneDriverById(id);
        model.addAttribute("driver", driver);
        return "drivers/show.jsp";
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
    public String edit(@PathVariable Long id, Model model){
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "edit.jsp";
    }

    @PutMapping("/cars/{id}")
    public String update(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    //! DELETE

    @DeleteMapping("/cars/{id}")
    public String delete(@PathVariable Long id){
        System.out.println(id);
        carService.deleteCar(id);
        return "redirect:/";
    }



}
