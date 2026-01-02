package com.encapsulationinterface.employeemanagementsystem;

 class PartTimeEmployee extends Employee implements Department {
	    private String department;
	    private int hoursWorked;
	    private double hourlyRate;

	    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
	        super(id, name, 0);
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

	  
	    double calculateSalary() {
	        return hoursWorked * hourlyRate;
	    }

	    public void assignDepartment(String departmentName) {
	        this.department = departmentName;
	    }
	    public String getDepartmentDetails() {
	        return department;
	    }

}
