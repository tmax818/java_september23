package co.tylermaxwell.mvcdemoredo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.mvcdemoredo.models.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long>{
    List<Driver> findAll();
    
}
