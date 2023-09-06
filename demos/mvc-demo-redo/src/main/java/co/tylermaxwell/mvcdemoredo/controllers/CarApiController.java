package co.tylermaxwell.mvcdemoredo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.services.CarService;

@RestController
@RequestMapping("/api")
public class CarApiController {

    @Autowired CarService carService;

    @GetMapping("")
    public List<Car> allCars(){
        List<Car> cars = carService.getAll();
        System.out.println(cars);
        return cars;
    }

    @GetMapping("/{id}")
    public Car oneCar(@PathVariable Long id){
        Car car = carService.getCarById(id);
        return car;
    } 
    
}
