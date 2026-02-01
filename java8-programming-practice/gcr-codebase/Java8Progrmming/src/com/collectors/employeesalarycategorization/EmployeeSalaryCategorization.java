package com.collectors.employeesalarycategorization;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
public class EmployeeSalaryCategorization {
	public static void main(String[] args) {
	 List<Employee> employees = Arrays.asList(
             new Employee("Amit", "IT", 60000),
             new Employee("Surbhi", "IT", 80000),
             new Employee("Deep", "HR", 50000),
             new Employee("Neha", "HR", 55000),
             new Employee("Subh", "Finance", 70000)
     );

     Map<String, Double> avgSalaryByDept =
             employees.stream()
                     .collect(Collectors.groupingBy(
                             Employee::getDepartment,
                             Collectors.averagingDouble(Employee::getSalary)
                     ));

     avgSalaryByDept.forEach((dept, avgSalary) ->
     System.out.println(dept + " average salary: ₹" + avgSalary));
}
}
