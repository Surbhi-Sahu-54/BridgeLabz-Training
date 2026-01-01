package com.objectmodeling.universitywithfacultiesanddepartments;

public class Universitywithfacultyanddepartmentmain{
	    public static void main(String[] args) {

	        Faculty f1 = new Faculty("Dr. Sharma");
	        Faculty f2 = new Faculty("Dr. Mehta");

	        University uni = new University("RGPV University");

	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical Engineering");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.displayDetails();

	        System.out.println("\n--- Deleting University ---");
	        uni.deleteUniversity();

	        System.out.println("\nFaculty still exists independently:");
	        f1.display();
	        f2.display();
	    }

}
