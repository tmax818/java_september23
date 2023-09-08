package co.tylermaxwell.mvcdemoredo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.mvcdemoredo.models.Driver;
import co.tylermaxwell.mvcdemoredo.repositories.DriverRepository;

@Service
public class DriverService {
    
    @Autowired DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver getOneDriverById(Long id) {
        Optional<Driver> driver = driverRepository.findById(id);
        return driver.orElse(null);
    }
}
