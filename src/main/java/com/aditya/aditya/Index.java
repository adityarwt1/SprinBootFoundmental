package com.aditya.aditya;

///// importin the important thing for the maven
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class Index {
    
    @GetMapping("/aditya")
    public Map<String, String> serveHello(){
         Map<String, String> respone = new HashMap<>() ;
        respone.put("name", "Aditya rawat");
         return respone;
    }
    @PostMapping("/adityapost")
     public Map<String, String> sayHelloInthePost(){
         Map<String, String> respone = new HashMap<>() ;
        respone.put("name", "Aditya rawat Post");
         return respone;
    }
}
