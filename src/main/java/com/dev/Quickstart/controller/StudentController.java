package com.dev.Quickstart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Quickstart.dto.StudentRequestDTO;
import com.dev.Quickstart.dto.StudentResponseDTO;
import com.dev.Quickstart.model.Student;
import com.dev.Quickstart.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/top")
    public ResponseEntity<Student> getTopStudent(){
        return ResponseEntity.ok(studentService.getTopStudent());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getOneStudent(@PathVariable int id){
        Optional<Student> student =  studentService.getStudentById(id);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("")
    public StudentResponseDTO createStudent(@Valid @RequestBody StudentRequestDTO request){
        return studentService.saveStudent(request);
    }
    @GetMapping("/search")
    public String getStudentBySearch(@RequestParam String name){
        return "search for : " + name;
    }
    @GetMapping("/filter")
    public String  getStudentByFilter(@RequestParam String name, @RequestParam int age){
        return name + " is " + age + " years old.";
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student){
        return studentService.updataStudent(id, student);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id){
        boolean deleted = studentService.deleteStudent(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
