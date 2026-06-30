package com.dev.Quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    public String helloWorld(){
        return "helloWorld";
    }
}
