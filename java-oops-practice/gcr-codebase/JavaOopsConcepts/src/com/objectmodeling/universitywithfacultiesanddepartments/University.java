package com.objectmodeling.universitywithfacultiesanddepartments;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Department> departments;   // Composition
    private List<Faculty> faculties;         // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    public void deleteUniversity() {
        departments.clear();  // Composition effect
        System.out.println("University deleted. All departments removed.");
    }
}