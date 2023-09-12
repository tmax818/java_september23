package co.tylermaxwell.beltdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.beltdemo.models.Show;
import co.tylermaxwell.beltdemo.repositories.ShowRepository;

@Service
public class ShowService {
    @Autowired ShowRepository showRepository;

    public void addShow(Show show) {
        showRepository.save(show);
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    public Show getOneShowById(Long id) {
        Optional<Show> show = showRepository.findById(id);
        return show.orElse(null);
    }

    public void updateAShow(Show show) {
        showRepository.save(show);
    }

    public void deleteShowById(Long id) {
        showRepository.deleteById(id);
    }    
}
