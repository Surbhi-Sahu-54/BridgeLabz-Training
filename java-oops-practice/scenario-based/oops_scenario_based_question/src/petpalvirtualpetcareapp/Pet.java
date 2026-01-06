package petpalvirtualpetcareapp;
import java.util.Random;

abstract class Pet implements IInteractable {

	    protected String name;
	    protected String type;
	    protected int age;

	    // Encapsulated variables
	    private int hunger;   // 0 = full, 100 = very hungry
	    private int energy;   // 0 = tired, 100 = energetic
	    private String mood;

	    // Constructor with random default values
	    public Pet(String name, String type, int age) {
	        Random r = new Random();
	        this.name = name;
	        this.type = type;
	        this.age = age;
	        this.hunger = r.nextInt(40) + 30;
	        this.energy = r.nextInt(40) + 30;
	        updateMood();
	    }

	    // Encapsulation: private state updated only via methods
	    private void updateMood() {
	        if (energy > 70 && hunger < 30)
	            mood = "Happy ";
	        else if (energy < 30)
	            mood = "Tired ";
	        else
	            mood = "Normal ";
	    }

	    // Common methods
	    public void feed() {
	        hunger -= 20;   // operator use
	        energy += 10;
	        if (hunger < 0) hunger = 0;
	        if (energy > 100) energy = 100;
	        updateMood();
	        System.out.println(name + " has been fed.");
	    }

	    public void play() {
	        energy -= 20;
	        hunger += 15;
	        if (energy < 0) energy = 0;
	        if (hunger > 100) hunger = 100;
	        updateMood();
	        System.out.println(name + " is playing.");
	    }

	    public void sleep() {
	        energy += 30;
	        if (energy > 100) energy = 100;
	        updateMood();
	        System.out.println(name + " is sleeping.");
	    }

	    public void showStatus() {
	        System.out.println("Pet: " + name + " (" + type + ")");
	        System.out.println("Age: " + age);
	        System.out.println("Hunger: " + hunger);
	        System.out.println("Energy: " + energy);
	        System.out.println("Mood: " + mood);
	        System.out.println("-----------------------");
	    }

	 // polymorphism
	    abstract void makeSound();
}
