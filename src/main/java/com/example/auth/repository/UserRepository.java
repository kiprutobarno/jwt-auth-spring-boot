package com.example.auth.repository;

import com.example.auth.model.UserDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This is an interface that extends the Spring Framework class CRUDRepository,
 * a generic class that takes two parameters as arguments which describe the
 * type of object the repository will be working with.
 * 
 * In this case the objects are UserDAO and the Id, an Integer Integer
 */
@Repository
public interface UserRepository extends CrudRepository<UserDAO, Integer> {
    UserDAO findByUsername(String username);
}