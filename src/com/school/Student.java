package com.school;

public class Student extends Person implements Storable {
    private int studentId;
    private boolean isPresent;

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
        this.isPresent = false; // default absent
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void markPresent() {
        this.isPresent = true;
    }

    public void markAbsent() {
        this.isPresent = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        super.displayInfo();
        System.out.println("Attendance: " + (isPresent ? "Present" : "Absent"));
    }

    @Override
    public String toStorageString() {
        return studentId + "," + getName() + "," + getAge() + "," + (isPresent ? "Present" : "Absent");
    }
}