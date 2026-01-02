package com.inheritance.schoolsystemwithdifferentroles;

public class Main{
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Surbhi", 20, "B.Tech");
        Staff st = new Staff("Ramesh", 35, "Administration");

        t.displayDetails();
        t.displayRole();
        System.out.println("------------------");

        s.displayDetails();
        s.displayRole();
        System.out.println("------------------");

        st.displayDetails();
        st.displayRole();
    }
}
