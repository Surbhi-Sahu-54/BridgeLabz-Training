package com.objectmodeling.companyanddepartments;
import java.util.ArrayList;

public class Department {
	private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name)); // composition
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }    
}
