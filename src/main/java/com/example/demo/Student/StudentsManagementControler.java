package com.example.demo.Student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentsManagementControler {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"billy audu"),
            new Student(2, "maria jones"),
            new Student(3,"annah smith")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents(){
        System.out.println("getAllStudents");
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudents(@RequestBody  Student student){
        System.out.println("registerNewStudents");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}" )
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable("studentId") Integer studentId , @RequestBody Student student){
        System.out.println("updateStudent");
        System.out.println(String.format("%s %s", studentId, student));
    }
}
