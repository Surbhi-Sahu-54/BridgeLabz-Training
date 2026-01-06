package edumentorpersonalizedlearningplatform;

	public class ShortCourse extends Course {

	    public ShortCourse(String courseName) {
	        super(courseName, 4);
	    }

	    @Override
	    public void generateCertificate(String learnerName) {
	        System.out.println(
	            "Certificate of Completion awarded to " + learnerName +
	            " for Short Course: " + courseName
	        );
	    }
}
