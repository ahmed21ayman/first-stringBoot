package com.dev.Quickstart.service;

import java.util.List;
import java.util.Optional;

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
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Integer id){
        return studentRepository.findById(id);
    } 
    public Student updataStudent(Integer id, Student student){
        if (!studentRepository.existsById(id)) {
            return null;
        }
        student.setId(id);
        return studentRepository.save(student);
    }
    public boolean deleteStudent(Integer id){
        if (!studentRepository.existsById(id)) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
