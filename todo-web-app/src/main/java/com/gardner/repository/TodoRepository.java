package com.gardner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gardner.models.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String>{

}
