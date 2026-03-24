package com.thinksworks.university.dto;

import com.thinksworks.university.enums.CourseType;

public class Course {
    private int courseId;
    private int credits;
    private int capacity;
    private CourseType type;


    public Course(int courseId, String courseName, int credits, int capacity, CourseType type) {
        this.courseId = courseId;
        this.credits = credits;
        this.capacity = capacity;
        this.type = type;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCredit() {
        return credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public CourseType getType() {
        return type;
    }
}
