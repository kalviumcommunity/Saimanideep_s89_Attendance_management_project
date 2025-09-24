package com.school;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student(1, "Madhu", 20);
        Student s2 = new Student(2, "Hari", 21);
        s1.markPresent(); // Mark Madhu as present
        s2.markAbsent();  // Mark Hari as absent

        // Create teacher
        Teacher t1 = new Teacher("Anil", 35, "Mathematics");

        // Create staff
        Staff staff1 = new Staff("Ravi", 40, "Clerk");

        // Create courses
        Course c1 = new Course();
        c1.setDetails("1", "Java");
        Course c2 = new Course();
        c2.setDetails("2", "Python");

        // Display student details
        System.out.println("Students:");
        s1.displayInfo();
        s2.displayInfo();

        // Display teacher details
        System.out.println("\nTeacher:");
        t1.displayInfo();

        // Display staff details
        System.out.println("\nStaff:");
        staff1.displayInfo();

        // Display course details
        System.out.println("\nCourses:");
        c1.displayDetails();
        c2.displayDetails();

        // Save students to students.txt
        List<Student> students = Arrays.asList(s1, s2);
        FileStorageService.saveToFile(students, "students.txt");

        // Save courses to courses.txt
        List<Course> courses = Arrays.asList(c1, c2);
        FileStorageService.saveToFile(courses, "courses.txt");

        // Save attendance log to Attendance_log.txt
        List<String> attendanceLog = new ArrayList<>();
        for (Student s : students) {
            attendanceLog.add(s.getName() + ": " + (s.isPresent() ? "Present" : "Absent"));
        }
        try (java.io.FileWriter writer = new java.io.FileWriter("Attendance_log.txt", false)) {
            for (String log : attendanceLog) {
                writer.write(log + System.lineSeparator());
            }
        } catch (Exception e) {
            System.out.println("Error writing attendance log");
        }
    }
}