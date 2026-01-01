package com.objectmodeling.universitymanagementsystem;

public class Professor {
    private String professorName;

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    // Communication
    public void assignProfessor(Course course) {
        course.setProfessor(this);
        System.out.println(professorName + " assigned to course " + course.getCourseName());
    }

    public String getProfessorName() {
        return professorName;
    }
}
