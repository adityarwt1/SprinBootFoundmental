package com.aditya.aditya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("name", "Aditya Rawat");
        response.put("role", "Full Stack Developer");
        response.put("language", "Java Spring Boot");
        return response; // Spring Boot automatically converts this to JSON
    }
}
