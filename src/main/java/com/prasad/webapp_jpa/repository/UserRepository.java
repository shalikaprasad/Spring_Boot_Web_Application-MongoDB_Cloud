package com.prasad.webapp_jpa.repository;

import com.prasad.webapp_jpa.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    public Users findByUsername(String username);
}