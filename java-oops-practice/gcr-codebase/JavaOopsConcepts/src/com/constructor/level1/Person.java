package com.constructor.level1;

public class Person {
	// Attributes
    private String name;
    private int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
        public static void main(String[] args) {

            // Original object
            Person p1 = new Person("Deep", 21);

            // Clone object using copy constructor
            Person p2 = new Person(p1);

            System.out.println("Original Person:");
            p1.display();

            System.out.println();

            System.out.println("Cloned Person:");
            p2.display();
        }
}
