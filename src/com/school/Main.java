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

        // Demonstrate AttendanceService overloaded methods
        AttendanceService attendanceService = new AttendanceService(students);

        // Marking via id, name, object, bulk
        attendanceService.markPresent(2); // mark Hari by id
        attendanceService.markPresent("Madhu"); // mark Madhu by name (idempotent)
        attendanceService.markPresent(s1); // mark via object
        attendanceService.markPresent(Arrays.asList(1, 2)); // bulk mark

        // Query different ways
        System.out.println("\nAttendance queries (overloaded):");
        System.out.println("By id 1: " + attendanceService.queryAttendance(1));
        System.out.println("By name 'Hari': " + attendanceService.queryAttendance("Hari"));
        System.out.println("By object s1: " + attendanceService.queryAttendance(s1));

        // Build attendance records polymorphically and display (reflecting service changes)
        List<AttendanceRecord> records = new ArrayList<>();
        for (Person p : directory) {
            records.add(new AttendanceRecord(p));
        }

        System.out.println("\nAttendance Log:");
        for (AttendanceRecord r : records) {
            r.displayRecord();
        }

        // Save attendance records to Attendance_log.txt using FileStorageService
        FileStorageService.saveToFile(records, "Attendance_log.txt");
    }
}