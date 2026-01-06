package fittrackyourpersonalfitnesstracker;

public class Main {
	    public static void main(String[] args) {

	        UserProfile user = new UserProfile("Surbhi", 21, 55.0, 1800);
	        user.displayProfile();

	        Workout workout1 = new CardioWorkout(30);
	        workout1.startWorkout();
	        double burned1 = workout1.calculateCalories(user.getWeight());
	        workout1.stopWorkout();

	        Workout workout2 = new StrengthWorkout(40);
	        workout2.startWorkout();
	        double burned2 = workout2.calculateCalories(user.getWeight());
	        workout2.stopWorkout();

	        double totalBurned = burned1 + burned2;

	        // Operator usage (progress calculation)
	        double remainingCalories = user.getDailyCalorieTarget() - totalBurned;

	        System.out.println("\nTotal Calories Burned: " + totalBurned);
	        System.out.println("Remaining Calories to Target: " + remainingCalories);
	    }
}
