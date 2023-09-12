package co.tylermaxwell.beltdemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltdemo.models.User;

public interface UserRepository extends CrudRepository<User, Long>  {
    Optional<User> findByEmail(String email);
}