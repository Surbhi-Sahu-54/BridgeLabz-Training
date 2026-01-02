package com.inheritance.employeemanagementsystem;

class Intern extends Employee {
    private int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration : " + durationMonths + " months");
    }
}
