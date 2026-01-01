package com.objectmodeling.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Aggregation
    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);

        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        }

        System.out.println("Students Enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
