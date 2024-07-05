package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
    @Autowired
    Test test;
    @GetMapping("/greet")
    public String greetMsg(){
        return test.greet();
    }
}
