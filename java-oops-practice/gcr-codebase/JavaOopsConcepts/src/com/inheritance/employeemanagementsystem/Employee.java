package com.inheritance.employeemanagementsystem;

public class Employee {
	    protected String name;
	    protected int id;
	    protected double salary;

	    // Constructor
	    Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    // Method to display details
	    void displayDetails() {
	        System.out.println("Name   : " + name);
	        System.out.println("ID     : " + id);
	        System.out.println("Salary : " + salary);
	    }

}
