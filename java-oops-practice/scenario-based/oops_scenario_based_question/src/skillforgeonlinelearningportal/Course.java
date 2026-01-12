package skillforgeonlinelearningportal;
import java.util.*;
public class Course {
	    private String title;
	    private Instructor instructor;
	    private double rating;
	    private List<String> modules;
	    private final List<String> reviews; // read-only externally

	    // Constructor with default modules
	    public Course(String title, Instructor instructor) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = new ArrayList<>();
	        this.modules.add("Introduction");
	        this.modules.add("Basics");
	        this.reviews = new ArrayList<>();
	    }

	    // Constructor with custom modules
	    public Course(String title, Instructor instructor, List<String> modules) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = modules;
	        this.reviews = new ArrayList<>();
	    }

	    // Protected rating logic (Encapsulation)
	    protected void updateRating(double newRating) {
	        if (newRating >= 0 && newRating <= 5) {
	            rating = newRating;
	        }
	    }

	    public double getRating() {
	        return rating;
	    }

	    // Read-only reviews
	    public List<String> getReviews() {
	        return Collections.unmodifiableList(reviews);
	    }

	    public void addReview(String review) {
	        reviews.add(review);
	    }

	    public void showCourse() {
	        System.out.println("\nCourse: " + title);
	        System.out.println("Instructor: " + instructor.name);
	        System.out.println("Modules: " + modules);
	        System.out.println("Rating: " + rating);
	    }
}
