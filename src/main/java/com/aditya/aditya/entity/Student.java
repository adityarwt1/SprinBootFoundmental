package com.aditya.aditya.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
    ///decalare the stundent like this
    @Id
    private String  id;
    private String name;
    private String fathername;


    public String getId(){
        return id;
    }

    public String getStudentName(){
        return name;
    }


    public String getFathername(){
        return fathername;
    }

}
