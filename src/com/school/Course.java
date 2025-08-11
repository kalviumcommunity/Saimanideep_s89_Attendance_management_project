package com.school;

public class Course {
    String courseId;
    String courseName;

    public void setDetails(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}