package fittrackyourpersonalfitnesstracker;

public class UserProfile {

	    private String name;
	    private int age;
	    private double weight;   // protected health data
	    private int dailyCalorieTarget;

	    // Default goal constructor
	    public UserProfile(String name, int age, double weight) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.dailyCalorieTarget = 2000; // default goal
	    }

	    // Custom goal constructor
	    public UserProfile(String name, int age, double weight, int dailyCalorieTarget) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.dailyCalorieTarget = dailyCalorieTarget;
	    }

	    // Getter (no direct access)
	    public double getWeight() {
	        return weight;
	    }

	    public int getDailyCalorieTarget() {
	        return dailyCalorieTarget;
	    }

	    public void displayProfile() {
	        System.out.println("User: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Daily Target: " + dailyCalorieTarget + " calories");
	    }

}
