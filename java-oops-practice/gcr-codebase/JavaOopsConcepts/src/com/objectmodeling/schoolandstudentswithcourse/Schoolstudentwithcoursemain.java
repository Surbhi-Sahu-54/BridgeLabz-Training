package com.objectmodeling.schoolandstudentswithcourse;

public class Schoolstudentwithcoursemain {
	  public static void main(String[] args) {

	        School school = new School("Coding Ninja");

	        Student s1 = new Student("Deep");
	        Student s2 = new Student("Subh");

	        Course c1 = new Course("Java");
	        Course c2 = new Course("Python");

	        school.addStudent(s1);
	        school.addStudent(s2);

	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);
	        s2.enrollCourse(c1);

	        s1.showCourses();
	        System.out.println();
	        s2.showCourses();
	        System.out.println();

	        c1.showStudents();
	        System.out.println();
	        c2.showStudents();
	    }
	
}
