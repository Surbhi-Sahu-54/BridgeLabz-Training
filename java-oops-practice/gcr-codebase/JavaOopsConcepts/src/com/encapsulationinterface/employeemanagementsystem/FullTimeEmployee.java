package com.encapsulationinterface.employeemanagementsystem;

	class FullTimeEmployee extends Employee implements Department {
	    private String department;
	    private double fixedSalary;

	    FullTimeEmployee(int id, String name, double fixedSalary) {
	        super(id, name, fixedSalary);
	        this.fixedSalary = fixedSalary;
	    }

	    @Override
	    double calculateSalary() {
	        return fixedSalary;
	    }

	    @Override
	    public void assignDepartment(String departmentName) {
	        this.department = departmentName;
	    }

	    @Override
	    public String getDepartmentDetails() {
	        return department;
	    }

}
