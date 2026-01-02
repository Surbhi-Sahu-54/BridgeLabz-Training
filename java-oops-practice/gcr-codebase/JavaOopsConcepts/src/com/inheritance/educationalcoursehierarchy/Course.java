package com.inheritance.educationalcoursehierarchy;

public class Course {
	    protected String courseName;
	    protected int duration; // in weeks

	    Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    void displayDetails() {
	        System.out.println("Course Name : " + courseName);
	        System.out.println("Duration    : " + duration + " weeks");
	    }
	
}
