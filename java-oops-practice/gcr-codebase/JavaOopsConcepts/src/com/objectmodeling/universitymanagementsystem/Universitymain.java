package com.objectmodeling.universitymanagementsystem;

public class Universitymain {
    public static void main(String[] args) {

        Student s1 = new Student("Subh");
        Student s2 = new Student("Deep");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Course("Object Oriented Programming");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignProfessor(c1);

        c1.showCourseDetails();
    }
}
