package com.aditya.aditya;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @GetMapping("/status")
    public ResponseEntity<Map<String, String>> StatusCode() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Bad Request Example");

        // Return status code 400 with the response
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
