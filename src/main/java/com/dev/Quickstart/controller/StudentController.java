package com.dev.Quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {
    @GetMapping("/students")
    public String allStudents(){
        return "all data";
    }
    @GetMapping("/student")
    public String oneStudent(){
        return "student one";
    }
}
