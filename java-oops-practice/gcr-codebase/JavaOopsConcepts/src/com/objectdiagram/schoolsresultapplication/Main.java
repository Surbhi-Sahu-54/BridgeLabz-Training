package com.objectdiagram.schoolsresultapplication;

public class Main {
	    public static void main(String[] args) {

	        Student john = new Student("Subh");
	        john.addSubject(new Subject("Maths", 90));
	        john.addSubject(new Subject("Science", 85));

	        GradeCalculator calculator = new GradeCalculator();

	        System.out.println("Student Name: " + john.getName());
	        System.out.println("Total Marks: " + calculator.calculateTotal(john));
	        System.out.println("Grade: " + calculator.calculateGrade(john));
	    }

}
