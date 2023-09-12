package co.tylermaxwell.mvcdemoredo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.mvcdemoredo.models.User;

public interface UserRepository extends CrudRepository<User, Long>  {
    Optional<User> findByEmail(String email);
}
