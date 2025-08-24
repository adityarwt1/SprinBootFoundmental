package com.aditya.aditya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aditya.aditya.Services.Student;
import com.aditya.aditya.entity.StudentEntity;

@RequestMapping
public class StudentController {
    @Autowired    
    private Student student;

    @PostMapping
    public boolean saveStudentData(@RequestBody StudentEntity studentData){
        student.saveStudent(studentData);
        return true;
    }
}
