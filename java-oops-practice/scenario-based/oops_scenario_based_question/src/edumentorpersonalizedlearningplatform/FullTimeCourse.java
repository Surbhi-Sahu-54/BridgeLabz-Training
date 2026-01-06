package edumentorpersonalizedlearningplatform;

public class FullTimeCourse extends Course {

	    public FullTimeCourse(String courseName) {
	        super(courseName, 24);
	    }

	    @Override
	    public void generateCertificate(String learnerName) {
	        System.out.println(
	            "Professional Certificate awarded to " + learnerName +
	            " for Full-Time Program: " + courseName
	        );
	    }
}
