package com.school;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create registration service
        RegistrationService registrationService = new RegistrationService();

        // Create and register students
        Student s1 = new Student(1, "Madhu", 20);
        Student s2 = new Student(2, "Hari", 21);
        registrationService.registerStudent(s1);
        registrationService.registerStudent(s2);

        // Create and register teacher
        Teacher t1 = new Teacher("Anil", 35, "Mathematics");
        registrationService.registerTeacher(t1);

        // Create and register staff
        Staff staff1 = new Staff("Ravi", 40, "Clerk");
        registrationService.registerStaff(staff1);

        // Create courses
        Course c1 = new Course();
        c1.setDetails("1", "Java");
        Course c2 = new Course();
        c2.setDetails("2", "Python");

        // Display School Directory (polymorphic)
        System.out.println("School Directory:");
        for (Person p : registrationService.getAllPersons()) {
            p.displayInfo(); // runtime polymorphism
            System.out.println();
        }

        // Display course details
        System.out.println("Courses:");
        c1.displayDetails();
        c2.displayDetails();

        // Save courses to courses.txt
        List<Course> courses = Arrays.asList(c1, c2);
        FileStorageService.saveToFile(courses, "courses.txt");

        // Create attendance service with registered students
        AttendanceService attendanceService = new AttendanceService(registrationService.getStudents());

        // Mark initial attendance
        s1.markPresent(); // Mark Madhu as present
        s2.markAbsent();  // Mark Hari as absent

        // Demonstrate AttendanceService overloaded methods
        attendanceService.markPresent(2); // mark Hari by id
        attendanceService.markPresent("Madhu"); // mark Madhu by name (idempotent)
        attendanceService.markPresent(s1); // mark via object
        attendanceService.markPresent(Arrays.asList(1, 2)); // bulk mark

        // Query different ways
        System.out.println("\nAttendance queries (overloaded):");
        System.out.println("By id 1: " + attendanceService.queryAttendance(1));
        System.out.println("By name 'Hari': " + attendanceService.queryAttendance("Hari"));
        System.out.println("By object s1: " + attendanceService.queryAttendance(s1));

        // Build attendance records polymorphically and display
        List<AttendanceRecord> records = new ArrayList<>();
        for (Person p : registrationService.getAllPersons()) {
            records.add(new AttendanceRecord(p));
        }

        System.out.println("\nAttendance Log:");
        for (AttendanceRecord r : records) {
            r.displayRecord();
        }

        // Save all data using services
        registrationService.saveAllToFiles();
        FileStorageService.saveToFile(records, "Attendance_log.txt");
    }
}