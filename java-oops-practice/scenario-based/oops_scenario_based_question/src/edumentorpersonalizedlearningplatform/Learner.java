package edumentorpersonalizedlearningplatform;

	public class Learner extends User implements ICertifiable {

	    private Course enrolledCourse;

	    public Learner(int userId, String name, String email) {
	        super(userId, name, email);
	    }

	    public void enrollCourse(Course course) {
	        this.enrolledCourse = course;
	    }

	    // Polymorphism based on course type
	    @Override
	    public void generateCertificate() {
	        if (enrolledCourse == null) {
	            System.out.println("No course enrolled");
	            return;
	        }
	        enrolledCourse.generateCertificate(name);
	    }
}
