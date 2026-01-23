package generics.coursemanagementsystem;

public class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseCode, String courseName, int credits, int totalAssignments) {
        super(courseCode, courseName, credits);
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() {
        return totalAssignments;
    }

    public void setTotalAssignments(int totalAssignments) {
        this.totalAssignments = totalAssignments;
    }

    @Override
    public String evaluationType() {
        return "Assignment-Based";
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Total Assignments: " + totalAssignments);
        System.out.println("----------------------");
    }
}
