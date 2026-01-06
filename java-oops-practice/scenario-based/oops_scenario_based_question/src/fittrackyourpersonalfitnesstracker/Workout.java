package fittrackyourpersonalfitnesstracker;

abstract class Workout implements ITrackable {

	    protected String type;
	    protected int duration; // in minutes
	    protected double caloriesBurned;

	    // Internal logs not directly exposed
	    protected void logWorkout() {
	        System.out.println("Workout logged internally.");
	    }

	    public abstract double calculateCalories(double weight);

	    public double getCaloriesBurned() {
	        return caloriesBurned;
	    }

	    @Override
	    public void startWorkout() {
	        System.out.println(type + " workout started.");
	    }

	    @Override
	    public void stopWorkout() {
	        System.out.println(type + " workout stopped.");
	        logWorkout();
	    }
}
