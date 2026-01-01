package com.objectmodeling.universitymanagementsystem;

public class Student{
	    private String studentName;

	    public Student(String studentName) {
	        this.studentName = studentName;
	    }

	    // Communication
	    public void enrollCourse(Course course) {
	        course.addStudent(this);
	        System.out.println(studentName + " enrolled in " + course.getCourseName());
	    }

	    public String getStudentName() {
	        return studentName;
	    }
	}

