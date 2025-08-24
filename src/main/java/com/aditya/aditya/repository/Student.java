package com.aditya.aditya.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Student extends MongoRepository<com.aditya.aditya.entity.Student,String  >{
    
}
