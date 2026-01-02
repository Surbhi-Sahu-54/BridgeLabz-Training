package com.inheritance.educationalcoursehierarchy;

public class Main {
	    public static void main(String[] args) {

	        Course c1 = new Course("Data Structures", 12);
	        Course c2 = new OnlineCourse("Java Programming", 10, "Coursera", true);
	        Course c3 = new PaidOnlineCourse(
	                "Machine Learning", 16, "Udemy", true, 5000, 20
	        );

	        c1.displayDetails();
	        System.out.println("--------------------");

	        c2.displayDetails();
	        System.out.println("--------------------");

	        c3.displayDetails();
	    }
}