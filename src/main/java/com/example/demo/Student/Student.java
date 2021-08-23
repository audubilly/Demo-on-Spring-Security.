package com.example.demo.Student;

public class  Student {

    private final Integer StudentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        StudentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
