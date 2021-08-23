package com.example.demo.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class StudentsManagementControler {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"billy audu"),
            new Student(2, "maria jones"),
            new Student(3,"annah smith")
    );
}
