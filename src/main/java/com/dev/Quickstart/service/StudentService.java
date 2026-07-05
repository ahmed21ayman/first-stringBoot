package com.dev.Quickstart.service;

import org.springframework.stereotype.Service;

import com.dev.Quickstart.model.Student;

@Service
public class StudentService {
    public Student getTopStudent(){
        return new Student("Ahmed", 23);
    }
}
