package skillforgeonlinelearningportal;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Instructor Name: ");
	        Instructor instructor = new Instructor(sc.nextLine(), "instructor@skillforge.com");

	        System.out.print("Enter Course Title: ");
	        String courseTitle = sc.nextLine();

	        List<String> modules = new ArrayList<>();
	        System.out.print("Enter number of modules: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Module " + (i + 1) + ": ");
	            modules.add(sc.nextLine());
	        }

	        Course course = new Course(courseTitle, instructor, modules);
	        course.updateRating(4.6);
	        course.addReview("Excellent Course");

	        System.out.print("\nEnter Student Name: ");
	        Student student = new AdvancedStudent(sc.nextLine(), "student@skillforge.com");

	        student.updateProgress(5, n);
	        student.calculateGrade(88);

	        course.showCourse();
	        student.displayRole();
	        student.generateCertificate();

	        sc.close();
	    }

}
