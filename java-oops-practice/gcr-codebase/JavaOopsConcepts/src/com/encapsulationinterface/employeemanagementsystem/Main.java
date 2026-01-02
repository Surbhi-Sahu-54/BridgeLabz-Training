package com.encapsulationinterface.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {

	        List<Employee> employees = new ArrayList<>();

	        FullTimeEmployee fte = new FullTimeEmployee(101, "Surbhi", 60000);
	        fte.assignDepartment("IT");

	        PartTimeEmployee pte = new PartTimeEmployee(102, "Rahul", 80, 500);
	        pte.assignDepartment("Support");

	        employees.add(fte);
	        employees.add(pte);

	        for (Employee emp : employees) {
	            emp.displayDetails();
	            System.out.println("Department  : " +
	                    ((Department) emp).getDepartmentDetails());
	            System.out.println("-------------------------");
	        }
	    }
	}

