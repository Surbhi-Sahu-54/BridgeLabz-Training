package edumentorpersonalizedlearningplatform;

	public abstract class Course {
	    protected String courseName;
	    protected int durationWeeks;

	    public Course(String courseName, int durationWeeks) {
	        this.courseName = courseName;
	        this.durationWeeks = durationWeeks;
	    }

	    // Polymorphic behavior
	    public abstract void generateCertificate(String learnerName);
	
}
