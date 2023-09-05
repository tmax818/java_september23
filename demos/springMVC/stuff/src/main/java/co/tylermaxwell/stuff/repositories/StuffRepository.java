package co.tylermaxwell.stuff.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.stuff.models.Stuff;

public interface StuffRepository extends CrudRepository<Stuff, Long> {


    
}
