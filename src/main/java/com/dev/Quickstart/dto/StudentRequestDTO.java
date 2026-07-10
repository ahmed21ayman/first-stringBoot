package com.dev.Quickstart.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentRequestDTO {

    @NotBlank(message = "Student name is required")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    public StudentRequestDTO() {
    }

    public StudentRequestDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}