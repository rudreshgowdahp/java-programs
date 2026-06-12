package com.thinksworks.object.runner;

import com.thinksworks.object.external.Student;
import com.thinksworks.object.external.Student;

public class MainRunner {
    public static void main(String[] args) {
        Student student = new Student(12,"rudra",12,"java",87.5d,"123@gmail.com",12345);
        Student student1 = new Student(12,"rudra",12,"java",87.5d,"123@gmail.com",12345);
        if (student==(student1)){
            System.out.println("same");
        }
        else{
            System.out.println("nope");
        }
    }

}
