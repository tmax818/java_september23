package co.tylermaxwell.beltdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltdemo.models.Show;

public interface ShowRepository extends CrudRepository<Show, Long> {
    List<Show> findAll();    
}
