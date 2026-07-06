package com.dev.Quickstart.service;

import org.springframework.stereotype.Service;
import com.dev.Quickstart.model.Student;
import com.dev.Quickstart.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
}
    public Student getTopStudent(){
        return new Student("Ahmed", 23);
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
