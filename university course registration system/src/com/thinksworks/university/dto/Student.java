package com.thinksworks.university.dto;

import com.thinksworks.university.enums.DepartmentType;

public class Student {
    private String studentName;
    private int studentId;
    private int totalCredits;
    private DepartmentType dept;

    public Student(String studentName, int studentId, int totalCredits, DepartmentType dept) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.totalCredits = totalCredits;
        this.dept = dept;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public DepartmentType getDept() {
        return dept;
    }
}
