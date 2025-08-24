package com.aditya.aditya.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<com.aditya.aditya.entity.StudentEntity,String  >{
    
}
