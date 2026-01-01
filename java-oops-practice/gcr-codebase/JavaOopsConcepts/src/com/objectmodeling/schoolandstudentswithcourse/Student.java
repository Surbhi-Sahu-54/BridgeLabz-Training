package com.objectmodeling.schoolandstudentswithcourse;
import java.util.List;
import java.util.ArrayList;
public class Student {
	  private String name;
	    private List<Course> courses;   // Association

	    public Student(String name) {
	        this.name = name;
	        this.courses = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    // Enroll student in a course
	    public void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this);   // maintain both sides
	    }

	    // View enrolled courses
	    public void showCourses() {
	        System.out.println(name + " is enrolled in:");
	        for (Course c : courses) {
	            System.out.println("- " + c.getCourseName());
	        }
	    }
}
