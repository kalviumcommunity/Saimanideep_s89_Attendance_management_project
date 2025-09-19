package com.school;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student(1, "Madhu", 20);
        Student s2 = new Student(2, "Hari", 21);

        // Create teacher
        Teacher t1 = new Teacher("Anil", 35, "Mathematics");

        // Create staff
        Staff staff1 = new Staff("Ravi", 40, "Clerk");

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
    }
}