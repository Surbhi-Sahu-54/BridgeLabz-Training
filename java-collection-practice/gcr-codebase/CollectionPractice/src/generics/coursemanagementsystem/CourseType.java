package generics.coursemanagementsystem;

public abstract class CourseType {
    private String courseCode;
    private String courseName;
    private int credits;

    public CourseType(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public abstract String evaluationType();

    public void displayCourse() {
        System.out.println("Code: " + courseCode + ", Name: " + courseName + ", Credits: " + credits + ", Type: " + evaluationType());
    }
}
