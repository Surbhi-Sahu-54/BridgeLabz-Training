package edumentorpersonalizedlearningplatform;

public class User {
	    protected int userId;
	    protected String name;
	    protected String email;

	    public User(int userId, String name, String email) {
	        this.userId = userId;
	        this.name = name;
	        this.email = email;
	    }

	    public void printDetails() {
	        System.out.println("ID: " + userId + ", Name: " + name + ", Email: " + email);
	    }
}
