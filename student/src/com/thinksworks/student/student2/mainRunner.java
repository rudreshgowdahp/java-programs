package com.thinksworks.student.student2;

import  com.thinksworks.student.student.studentInfo;
import com.thinksworks.student.student.studentperformance;

public class mainRunner {
    public static void main(String[]args){
        studentInfo StudentInfo = new studentInfo();
        studentperformance Studentperformance = new studentperformance();
        StudentInfo.studentid();
        Studentperformance.display();
    }
}
