package com.objectmodeling.companyanddepartments;

public class Employee {
	   private String empName;
	    private int empId;

	    public Employee(int empId, String empName) {
	        this.empId = empId;
	        this.empName = empName;
	    }

	    public void displayEmployee() {
	        System.out.println("Employee ID: " + empId + ", Name: " + empName);
	    }
}
