package com.dev.Quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/all")
    public String allStudents(){
        return "all data";
    }
    @GetMapping("/top")
    public String topStudent(){
        return "top one";
    }
}
