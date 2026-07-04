package com.dev.Quickstart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Quickstart.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("")
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("ayman", 24));
        students.add(new Student("omar", 20));
        students.add(new Student("Ahmed", 30));
        return students;
    }
    @GetMapping("/top")
    public Student getTopStudent(){
        return new Student("ayman", 23);
    }
    @GetMapping("/{id}")
    public String getOneStudent(){
        return "one";
    }
    @PostMapping("")
    public Student createStudent(@RequestBody Student student){
        return student;
    }
}
