package com.school;

public class Student extends Person {
    private int studentId;

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        super.displayInfo();
    }
}