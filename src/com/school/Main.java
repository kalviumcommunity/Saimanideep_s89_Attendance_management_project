package com.school;

public class Main {
    public static void main(String[] args) {
        // Create and set student details
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Madhu");
        students[1] = new Student();
        students[1].setDetails(2, "Hari");

        // Create and set course details
        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails("1", "Java");
        courses[1] = new Course();
        courses[1].setDetails("2", "Python");

        // Display student details
        System.out.println("Students:");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display course details
        System.out.println("Courses:");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}