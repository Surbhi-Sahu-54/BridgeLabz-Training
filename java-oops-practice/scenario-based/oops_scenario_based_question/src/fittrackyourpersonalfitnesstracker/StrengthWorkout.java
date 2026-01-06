package fittrackyourpersonalfitnesstracker;

class StrengthWorkout extends Workout {

	    public StrengthWorkout(int duration) {
	        this.type = "Strength";
	        this.duration = duration;
	    }

	    public double calculateCalories(double weight) {
	        caloriesBurned = duration * weight * 0.06;
	        return caloriesBurned;
	    }
}
