package com.dev.Quickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.Quickstart.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
