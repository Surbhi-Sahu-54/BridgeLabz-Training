package campusconnectcollegeinformationsystem;

public class Person {
	    protected int id;
	    protected String name;
	    protected String email;

	    public Person(int id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    }

	    // Polymorphic method
	    public void printDetails() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
	    }
}
