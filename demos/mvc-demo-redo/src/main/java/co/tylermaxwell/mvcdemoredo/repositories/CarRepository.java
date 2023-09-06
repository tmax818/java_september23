package co.tylermaxwell.mvcdemoredo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.mvcdemoredo.models.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();
}
