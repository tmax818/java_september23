package co.tylermaxwell.mvcdemoredo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.mvcdemoredo.models.Car;
import co.tylermaxwell.mvcdemoredo.models.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long>{
    List<Driver> findAll();
    List<Driver> findByCarsNotContains(Car car);
    List<Driver> findByCarsContains(Car car);
    
}
