package com.objectmodeling.schoolandstudentswithcourse;
import java.util.ArrayList;
import java.util.List;
public class Course {
	  private String courseName;
	    private List<Student> students;   // Association

	    public Course(String courseName) {
	        this.courseName = courseName;
	        this.students = new ArrayList<>();
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    // Add student to course
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    // Show enrolled students
	    public void showStudents() {
	        System.out.println("Students enrolled in " + courseName + ":");
	        for (Student s : students) {
	            System.out.println("- " + s.getName());
	        }
	    }
}
