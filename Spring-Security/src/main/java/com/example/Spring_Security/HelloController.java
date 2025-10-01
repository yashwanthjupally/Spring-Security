package com.example.Spring_Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  {

    @GetMapping("/")
    public String greeting(){
        return "Hello, Welcome to Spring Security";
    }
}
