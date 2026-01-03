package com.example.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceARestController {

    @GetMapping("/hello-eureka")
    public String helloEureka(){
        return "Eureka server running, communication established successfully";
    }


}
