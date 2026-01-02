package com.inheritance.schoolsystemwithdifferentroles;

public class Person {
	    protected String name;
	    protected int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void displayDetails() {
	        System.out.println("Name : " + name);
	        System.out.println("Age  : " + age);
	    }

}
