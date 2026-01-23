package generics.coursemanagementsystem;

import java.util.*;

public class Course<T extends CourseType> {
    private ArrayList<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        for (T c : courseList) {
            if (c.getCourseCode().equalsIgnoreCase(course.getCourseCode())) {
                System.out.println("Course code already exists.");
                return;
            }
        }
        courseList.add(course);
        System.out.println("Course added.");
    }

    public void removeCourse(String courseCode) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseCode().equalsIgnoreCase(courseCode)) {
                courseList.remove(i);
                System.out.println("Course removed.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void displayAllCourses() {
        if (courseList.size() == 0) {
            System.out.println("No courses available.");
            return;
        }

        for (T c : courseList) {
            c.displayCourse();
        }
    }

    public ArrayList<T> getCourseList() {
        return courseList;
    }

    public static void displayAnyCourseList(List<? extends CourseType> list) {
        if (list.size() == 0) {
            System.out.println("No courses available.");
            return;
        }

        for (CourseType c : list) {
            c.displayCourse();
        }
    }
}
