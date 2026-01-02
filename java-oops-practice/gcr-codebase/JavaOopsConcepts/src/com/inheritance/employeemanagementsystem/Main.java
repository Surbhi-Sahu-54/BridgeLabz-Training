package com.inheritance.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Surbhi", 101, 80000, 10);
        Employee e2 = new Developer("Subh", 102, 60000, "Java");
        Employee e3 = new Intern("Deep", 103, 15000, 6);

        e1.displayDetails();
        System.out.println("-----------------");

        e2.displayDetails();
        System.out.println("-----------------");

        e3.displayDetails();
    }
}
