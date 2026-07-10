package com.dev.Quickstart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dev.Quickstart.dto.StudentRequestDTO;
import com.dev.Quickstart.dto.StudentResponseDTO;
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
    public StudentResponseDTO saveStudent(StudentRequestDTO request){
        Student student = new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());
        Student savedStudent = studentRepository.save(student);
        return new StudentResponseDTO(savedStudent.getId(), savedStudent.getName(), savedStudent.getAge());
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public StudentResponseDTO getStudentById(Integer id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty()) {
            return null;
        }
        Student s = student.get();
        return new StudentResponseDTO(s.getId(), s.getName(), s.getAge());
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
