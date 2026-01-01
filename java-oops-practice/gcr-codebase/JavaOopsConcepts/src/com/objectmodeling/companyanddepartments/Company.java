package com.objectmodeling.companyanddepartments;
import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
        System.out.println("---------------------");
    }

    // Simulating deletion of company
    public void closeCompany() {
        departments.clear();   // deletes all departments & employees
        System.out.println(companyName + " company is closed.");
    }
}
