package com.aditya.aditya.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "student")
public class StudentEntity {
    ///decalare the stundent like this
    @Id
    private String  id;
    private String name;
    private String fathername;
    private Date date;

    public String getId(){
        return id;
    }

    public String getStudentName(){
        return name;
    }


    public String getFathername(){
        return fathername;
    }

    public Date getDate(){
        return date;
    }

}
