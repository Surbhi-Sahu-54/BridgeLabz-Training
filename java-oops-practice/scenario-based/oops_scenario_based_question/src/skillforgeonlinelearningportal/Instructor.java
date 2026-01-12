package skillforgeonlinelearningportal;

	class Instructor extends User {

	    public Instructor(String name, String email) {
	        super(name, email);
	    }

	    @Override
	    void displayRole() {
	        System.out.println("Role: Instructor");
	    }

}
