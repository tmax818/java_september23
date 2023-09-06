package co.tylermaxwell.mvcdemoredo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.repositories.CarRepository;

@Service
public class CarService {

    @Autowired CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()){
            return car.get();
        } else {
            return null;
        }
        
    }


    
}
