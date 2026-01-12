package skillforgeonlinelearningportal;

	class Student extends User implements ICertifiable {

	    private int progress;   // percentage
	    private int grade;

	    public Student(String name, String email) {
	        super(name, email);
	    }

	    public void updateProgress(int completed, int total) {
	        progress = (completed * 100) / total;   // operator usage
	    }

	    public void calculateGrade(int marks) {
	        grade = marks >= 90 ? 10 : marks >= 75 ? 8 : 6;
	    }

	    @Override
	    public void generateCertificate() {
	        System.out.println("Certificate for Student: " + name);
	        System.out.println("Grade: " + grade + " | Progress: " + progress + "%");
	    }

	    @Override
	    void displayRole() {
	        System.out.println("Role: Student");
	    }
}
