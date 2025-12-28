package com.constructor.level1;

public class Student {

    public String rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to modify CGPA
    public void modifyCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Display method
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
