package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> list() {
        return studentService.getList();
    }

    @PostMapping("/student")
    public void registerStudent(@RequestBody Student student ){

        studentService.registerStudent(student);
    }
}
