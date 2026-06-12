package com.thinksworks.object.external;

import java.util.Objects;

public class Student {
      private   int id;
      private String name;
      private   int age;
      private   String course;
        private double marks;
        private String email;
        private long phone;

    public Student(int id, String name, int age, String course, double marks, String email, long phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(marks, student.marks) == 0 && phone == student.phone && Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, course, marks, email, phone);
    }
}

