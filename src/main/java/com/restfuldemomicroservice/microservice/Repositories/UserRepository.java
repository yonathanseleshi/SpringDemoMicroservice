package com.restfuldemomicroservice.microservice.Repositories;

import com.restfuldemomicroservice.microservice.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}
