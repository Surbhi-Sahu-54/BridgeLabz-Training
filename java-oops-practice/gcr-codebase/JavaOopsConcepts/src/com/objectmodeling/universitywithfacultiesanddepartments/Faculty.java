package com.objectmodeling.universitywithfacultiesanddepartments;

public class Faculty {
	  private String name;

	    public Faculty(String name) {
	        this.name = name;
	    }

	    public void display() {
	        System.out.println("Faculty Name: " + name);
	    }
}
