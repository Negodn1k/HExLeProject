package com.hex.hexleproject.controllers;

import com.hex.hexleproject.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/get")
    public List<Student> FindAllStudents() {
        return List.of(
                Student.builder().name("Miha").surname("Lox").email("MihaLoh@hmail.ch").age(45).build(),
                Student.builder().name("Sasha").surname("Lox").email("SashaLoh@hmail.ch").age(45).build(),
                Student.builder().name("Slava").surname("Lox").email("SlavaLoh@hmail.ch").age(45).build()
        );
    }
}
