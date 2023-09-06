package co.tylermaxwell.mvcdemoredo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tylermaxwell.mvcdemoredo.models.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();
}
