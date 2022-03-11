package com.example.student_reg.controller;

import com.example.student_reg.model.Student;
import com.example.student_reg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class StudentController {



    /**
     * The autowired annotation is used to get rid of setter methods
     * */
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
