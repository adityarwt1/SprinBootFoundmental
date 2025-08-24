package com.aditya.aditya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.aditya.Services.Student;
import com.aditya.aditya.entity.StudentEntity;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired    
    private Student student;

    @PostMapping
    public boolean saveStudentData(@RequestBody StudentEntity studentData){
        student.saveStudent(studentData);
        return true;
    }
}
