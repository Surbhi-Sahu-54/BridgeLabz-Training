package fittrackyourpersonalfitnesstracker;

class CardioWorkout extends Workout {

	    public CardioWorkout(int duration) {
	        this.type = "Cardio";
	        this.duration = duration;
	    }
	    public double calculateCalories(double weight) {
	        caloriesBurned = duration * weight * 0.08;
	        return caloriesBurned;
	    }
}
