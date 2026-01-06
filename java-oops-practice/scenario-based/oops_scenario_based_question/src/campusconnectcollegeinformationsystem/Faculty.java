package campusconnectcollegeinformationsystem;

	public class Faculty extends Person {

	    private String department;

	    public Faculty(int id, String name, String email, String department) {
	        super(id, name, email);
	        this.department = department;
	    }

	    // Polymorphism
	   
	    public void printDetails() {
	        System.out.println(
	            "Faculty ID: " + id +
	            ", Name: " + name +
	            ", Email: " + email +
	            ", Department: " + department
	        );
	    }

}
