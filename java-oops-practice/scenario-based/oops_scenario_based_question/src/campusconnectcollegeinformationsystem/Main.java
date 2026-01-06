package campusconnectcollegeinformationsystem;

public class Main {
	    public static void main(String[] args) {

	        Faculty f1 = new Faculty(1, "Dr. Sharma", "sharma@college.edu", "CSE");

	        Student s1 = new Student(101, "Surbhi", "surbhi@gmail.com");
	        Student s2 = new Student(102, "Deep", "deep@gmail.com");

	        s1.addGrade(8);
	        s1.addGrade(9);
	        s2.addGrade(7);
	        s2.addGrade(8);

	        Course c1 = new Course("Data Structures", f1);

	        s1.enrollCourse(c1);
	        s2.enrollCourse(c1);

	        System.out.println("\n--- Course Details ---");
	        c1.displayCourseDetails();

	        System.out.println("\n--- Polymorphism Demo ---");
	        Person p1 = s1;
	        Person p2 = f1;

	        p1.printDetails();
	        p2.printDetails();
	    }
}

