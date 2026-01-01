package com.objectmodeling.universitywithfacultiesanddepartments;

public class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void display() {
        System.out.println("Department: " + departmentName);
    }
}

