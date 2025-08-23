package com.aditya.aditya;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class Status {
    @GetMapping("/status")
    public Map<String, String> StatusCode(){
        Map<String , String> response = new HashMap<>();
        response.put("status", "400");
        return response;
    }
}
