package com.constructor.level1;

public class Circle {

    // Attribute
    private double radius;

    // 1️⃣ Default Constructor
    Circle() {
        this(5.0); 
    }

    // 2️⃣ Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    void display() {
        System.out.println("Radius: " + radius);
    }
   public static void main(String[] args) {

            // Using default constructor
            Circle c1 = new Circle();
            c1.display();

            // Using parameterized constructor
            Circle c2 = new Circle(10.5);
            c2.display();
        }
    }

