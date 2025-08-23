package com.aditya.aditya;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class UserRequest {
    private String name;
    private int age;

    // getters and setters (required for JSON mapping)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

@RestController
public class BodyController {

    @PostMapping("/body")
    public UserRequest readBody(@RequestBody UserRequest request) {
        return request;
    }
}
