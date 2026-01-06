package edumentorpersonalizedlearningplatform;

	public class Instructor extends User {

	    private String expertise;

	    public Instructor(int userId, String name, String email, String expertise) {
	        super(userId, name, email);
	        this.expertise = expertise;
	    }

	    @Override
	    public void printDetails() {
	        System.out.println(
	            "Instructor: " + name +
	            ", Expertise: " + expertise +
	            ", Email: " + email
	        );
	    }
}
