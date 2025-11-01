package com.school;

import java.util.*;

public class RegistrationService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Staff> staff = new ArrayList<>();

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void registerTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void registerStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    public List<Staff> getStaff() {
        return new ArrayList<>(staff);
    }

    public List<Person> getAllPersons() {
        List<Person> all = new ArrayList<>();
        all.addAll(students);
        all.addAll(teachers);
        all.addAll(staff);
        return all;
    }

    public void saveAllToFiles() {
        FileStorageService.saveToFile(students, "students.txt");
        FileStorageService.saveToFile(teachers, "teachers.txt");
        FileStorageService.saveToFile(staff, "staff.txt");
    }
}