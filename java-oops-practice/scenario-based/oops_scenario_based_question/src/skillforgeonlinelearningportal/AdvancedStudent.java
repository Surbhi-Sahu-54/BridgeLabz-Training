package skillforgeonlinelearningportal;

public class AdvancedStudent extends Student {

	    public AdvancedStudent(String name, String email) {
	        super(name, email);
	    }

	    @Override
	    public void generateCertificate() {
	        System.out.println("Advanced Level Certificate");
	        System.out.println("Awarded to: " + name);
	    }
	
}
