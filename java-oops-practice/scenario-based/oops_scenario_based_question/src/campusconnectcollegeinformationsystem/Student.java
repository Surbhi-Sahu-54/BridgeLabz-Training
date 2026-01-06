package campusconnectcollegeinformationsystem;

	public class Student extends Person implements ICourseActions {

	    private int[] grades;   // private for encapsulation
	    private int gradeCount = 0;

	    public Student(int id, String name, String email) {
	        super(id, name, email);
	        grades = new int[5]; // max 5 subjects
	    }

	    // Add grade
	    public void addGrade(int grade) {
	        if (gradeCount < grades.length) {
	            grades[gradeCount++] = grade;
	        }
	    }

	    // GPA calculation using operators
	    public double calculateGPA() {
	        if (gradeCount == 0) return 0.0;

	        int sum = 0;
	        for (int i = 0; i < gradeCount; i++) {
	            sum += grades[i];
	        }
	        return (double) sum / gradeCount;
	    }

	    public void enrollCourse(Course course) {
	        course.addStudent(this);
	        System.out.println(name + " enrolled in " + course.getCourseName());
	    }

	    public void dropCourse(Course course) {
	        course.removeStudent(this);
	        System.out.println(name + " dropped " + course.getCourseName());
	    }

	    public void printDetails() {
	        System.out.println(
	            "Student ID: " + id +
	            ", Name: " + name +
	            ", Email: " + email +
	            ", GPA: " + calculateGPA()
	        );
	    }
}
