package com.thinksworks.university.service;

import com.thinksworks.university.dto.Course;
import com.thinksworks.university.dto.Student;

public class Registration {

    public void printCoursedetails(Course course){
        System.out.println("Course id:"+course.getCourseId());
        System.out.println("Course credit :"+course.getCredit());
        System.out.println("Course Capacity:"+course.getCapacity());
        System.out.println("Course type:"+course.getType());
    }
    public void printStudentDetails(Student student){
        System.out.println("Student id:"+student.getStudentId());
        System.out.println("Student name:"+student.getStudentName());
        System.out.println("Total credit:"+student.getTotalCredits());
        System.out.println("Department type:"+student.getDept());
    }
    public void register(Student student,Course course){
        if(course.getCapacity()>0){
            System.out.println("Registration Successfully");
        }
    }
    public void showLowCapacityCourses(Course[] course){
        for (Course courses:course){
            if(courses.getCapacity()<=1){
                printCoursedetails(courses);
            }
        }

    }
    public void printRegisterStudent(Student[] students){
        for ()
    }

}
