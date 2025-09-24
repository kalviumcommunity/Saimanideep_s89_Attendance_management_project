package com.school;

public class Teacher extends Person implements Storable {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toStorageString() {
        return getName() + "," + getAge() + "," + subject;
    }
}
