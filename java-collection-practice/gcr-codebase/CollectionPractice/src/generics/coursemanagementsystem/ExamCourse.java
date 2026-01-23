package generics.coursemanagementsystem;

public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String courseCode, String courseName, int credits, int totalMarks) {
        super(courseCode, courseName, credits);
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String evaluationType() {
        return "Exam-Based";
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("----------------------");
    }
}
