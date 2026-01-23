package generics.coursemanagementsystem;
import java.util.*;

public class UniversityMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        while (true) {
            System.out.println("\nUniversity Course Management System");
            System.out.println("1. Add Exam Course");
            System.out.println("2. Add Assignment Course");
            System.out.println("3. Add Research Course");
            System.out.println("4. Remove Course");
            System.out.println("5. Display All Courses");
            System.out.println("6. Display Any Course List (Wildcard)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Course Code: ");
                String code = sc.nextLine();

                System.out.print("Enter Course Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Credits: ");
                int credits = sc.nextInt();

                System.out.print("Enter Total Marks: ");
                int marks = sc.nextInt();

                examCourses.addCourse(new ExamCourse(code, name, credits, marks));

            } else if (ch == 2) {
                System.out.print("Enter Course Code: ");
                String code = sc.nextLine();

                System.out.print("Enter Course Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Credits: ");
                int credits = sc.nextInt();

                System.out.print("Enter Total Assignments: ");
                int total = sc.nextInt();

                assignmentCourses.addCourse(new AssignmentCourse(code, name, credits, total));

            } else if (ch == 3) {
                System.out.print("Enter Course Code: ");
                String code = sc.nextLine();

                System.out.print("Enter Course Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Credits: ");
                int credits = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Research Topic: ");
                String topic = sc.nextLine();

                researchCourses.addCourse(new ResearchCourse(code, name, credits, topic));

            } else if (ch == 4) {
                System.out.println("Remove from:");
                System.out.println("1. Exam Course List");
                System.out.println("2. Assignment Course List");
                System.out.println("3. Research Course List");
                System.out.print("Enter option: ");
                int opt = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course Code to Remove: ");
                String code = sc.nextLine();

                if (opt == 1) examCourses.removeCourse(code);
                else if (opt == 2) assignmentCourses.removeCourse(code);
                else if (opt == 3) researchCourses.removeCourse(code);
                else System.out.println("Invalid option");

            } else if (ch == 5) {
                System.out.println("\nExam Courses:");
                examCourses.displayAllCourses();

                System.out.println("\nAssignment Courses:");
                assignmentCourses.displayAllCourses();

                System.out.println("\nResearch Courses:");
                researchCourses.displayAllCourses();

            } else if (ch == 6) {
                System.out.println("Wildcard Display:");
                System.out.println("1. Exam Courses");
                System.out.println("2. Assignment Courses");
                System.out.println("3. Research Courses");
                System.out.print("Enter option: ");
                int opt = sc.nextInt();

                if (opt == 1) Course.displayAnyCourseList(examCourses.getCourseList());
                else if (opt == 2) Course.displayAnyCourseList(assignmentCourses.getCourseList());
                else if (opt == 3) Course.displayAnyCourseList(researchCourses.getCourseList());
                else System.out.println("Invalid option");

            } else if (ch == 7) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}
