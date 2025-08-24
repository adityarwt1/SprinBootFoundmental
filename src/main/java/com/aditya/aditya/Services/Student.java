package com.aditya.aditya.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.aditya.aditya.entity.StudentEntity;
import com.aditya.aditya.repository.StudentRepository;

public class Student {
 @Autowired
 private   StudentRepository StudentRepository;

 public void saveStudent(StudentEntity studentEntity){
    StudentRepository.save(studentEntity);
 }
}
