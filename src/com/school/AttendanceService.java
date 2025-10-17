package com.school;

import java.util.*;

public class AttendanceService {
    private Map<Integer, Student> studentsById = new HashMap<>();
    private Map<String, Student> studentsByName = new HashMap<>();

    public AttendanceService(Collection<Student> students) {
        for (Student s : students) {
            studentsById.put(s.getStudentId(), s);
            studentsByName.put(s.getName(), s);
        }
    }

    // Overloaded mark methods
    public boolean markPresent(int studentId) {
        Student s = studentsById.get(studentId);
        if (s == null) return false;
        s.markPresent();
        return true;
    }

    public boolean markPresent(String studentName) {
        Student s = studentsByName.get(studentName);
        if (s == null) return false;
        s.markPresent();
        return true;
    }

    public boolean markPresent(Student student) {
        if (student == null) return false;
        student.markPresent();
        studentsById.put(student.getStudentId(), student);
        studentsByName.put(student.getName(), student);
        return true;
    }

    // Bulk mark
    public void markPresent(Collection<Integer> ids) {
        for (Integer id : ids) {
            markPresent(id);
        }
    }

    // Overloaded query methods
    public String queryAttendance(int studentId) {
        Student s = studentsById.get(studentId);
        if (s == null) return "Not Found";
        return s.isPresent() ? "Present" : "Absent";
    }

    public String queryAttendance(String studentName) {
        Student s = studentsByName.get(studentName);
        if (s == null) return "Not Found";
        return s.isPresent() ? "Present" : "Absent";
    }

    public String queryAttendance(Student student) {
        if (student == null) return "Not Found";
        return student.isPresent() ? "Present" : "Absent";
    }
}
