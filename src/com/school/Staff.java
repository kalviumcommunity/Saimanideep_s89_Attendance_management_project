package com.school;

public class Staff extends Person implements Storable {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }

    @Override
    public String toStorageString() {
        return getName() + "," + getAge() + "," + role;
    }
}
