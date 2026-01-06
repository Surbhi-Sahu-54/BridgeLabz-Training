package campusconnectcollegeinformationsystem;

public class Course {
	    private String courseName;
	    private Faculty faculty;
	    private Student[] students;
	    private int count = 0;

	    public Course(String courseName, Faculty faculty) {
	        this.courseName = courseName;
	        this.faculty = faculty;
	        students = new Student[10];
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void addStudent(Student s) {
	        if (count < students.length) {
	            students[count++] = s;
	        }
	    }

	    public void removeStudent(Student s) {
	        for (int i = 0; i < count; i++) {
	            if (students[i] == s) {
	                students[i] = students[count - 1];
	                students[count - 1] = null;
	                count--;
	                return;
	            }
	        }
	    }

	    public void displayCourseDetails() {
	        System.out.println("Course: " + courseName);
	        System.out.println("Faculty:");
	        faculty.printDetails();

	        System.out.println("Enrolled Students:");
	        for (int i = 0; i < count; i++) {
	            students[i].printDetails();
	        }
	    }
}
