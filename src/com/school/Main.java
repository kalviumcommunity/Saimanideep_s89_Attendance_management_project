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

        // Build a polymorphic school directory
        List<Person> directory = new ArrayList<>();
        directory.add(s1);
        directory.add(s2);
        directory.add(t1);
        directory.add(staff1);

        // Display School Directory (polymorphic)
        System.out.println("School Directory:");
        for (Person p : directory) {
            p.displayInfo(); // runtime polymorphism
            System.out.println();
        }

        // Display course details
        System.out.println("Courses:");
        c1.displayDetails();
        c2.displayDetails();

        // Save students to students.txt
        List<Student> students = Arrays.asList(s1, s2);
        FileStorageService.saveToFile(students, "students.txt");

        // Save courses to courses.txt
        List<Course> courses = Arrays.asList(c1, c2);
        FileStorageService.saveToFile(courses, "courses.txt");

        // Build attendance records polymorphically and display
        List<AttendanceRecord> records = new ArrayList<>();
        for (Person p : directory) {
            records.add(new AttendanceRecord(p));
        }

        System.out.println("\nAttendance Log:");
        for (AttendanceRecord r : records) {
            r.displayRecord();
        }

        // Save attendance records to Attendance_log.txt using FileStorageService
        // FileStorageService expects Storable; AttendanceRecord implements Storable
        FileStorageService.saveToFile(records, "Attendance_log.txt");
    }
}