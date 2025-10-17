package com.school;

public class AttendanceRecord implements Storable {
    private Person person;
    private String status; // Present/Absent/N/A

    public AttendanceRecord(Person person) {
        this.person = person;
        this.status = deriveStatus(person);
    }

    private String deriveStatus(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            return s.isPresent() ? "Present" : "Absent";
        }
        // For Teacher and Staff, attendance may not apply
        return "N/A";
    }

    public Person getPerson() {
        return person;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toStorageString() {
        return person.getName() + "," + person.getAge() + "," + status;
    }

    public void displayRecord() {
        System.out.println(person.getName() + " (" + person.getClass().getSimpleName() + ") - " + status);
    }
}
