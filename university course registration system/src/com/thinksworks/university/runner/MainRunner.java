package com.thinksworks.university.runner;

import com.thinksworks.university.dto.Course;
import com.thinksworks.university.dto.Student;
import com.thinksworks.university.enums.CourseType;
import com.thinksworks.university.enums.DepartmentType;
import com.thinksworks.university.service.Registration;

import static com.thinksworks.university.enums.CourseType.JAVA;

public class MainRunner {
    public static void main(String[] args) {

        Course course = new Course(2,"java",10,5, JAVA);
        Course course1 = new Course(202,"Ai",5,4,CourseType.AI);
        Course course2 = new Course(203,"Python",7,9,CourseType.PYTHON);

        Course[] courses = {course,course1,course2};

        Student student = new Student("Rudresh",10,9, DepartmentType.AI_DEPT);
        Student student1 = new Student("Gagan",9,10,DepartmentType.PYTHON_DEPT);
        Student student2 = new Student("Sathish",8,9,DepartmentType.JAVA_DEPT);

        Student[] students = {student,student1,student2};

        Registration registration = new Registration();
        registration.printCoursedetails(course);
        registration.printStudentDetails(student);
        registration.register(student,course);
        registration.showLowCapacityCourses(courses);



    }

}
