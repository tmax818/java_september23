package co.tylermaxwell.mvcdemoredo.services;

import java.util.List;

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


    
}
