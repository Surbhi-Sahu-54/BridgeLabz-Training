package petpalvirtualpetcareapp;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	    

	    	        Scanner sc = new Scanner(System.in);
	    	        Pet pet = null;

	    	        System.out.println("Welcome to PetPal" + "");
	    	        System.out.println("Choose Pet Type:");
	    	        System.out.println("1. Dog");
	    	        System.out.println("2. Cat");
	    	        System.out.println("3. Bird");

	    	        int choice = sc.nextInt();
	    	        sc.nextLine(); // consume newline

	    	        System.out.print("Enter Pet Name: ");
	    	        String name = sc.nextLine();

	    	        System.out.print("Enter Pet Age: ");
	    	        int age = sc.nextInt();

	    	       //polymorphism
	    	        switch (choice) {
	    	            case 1 -> pet = new Dog(name, age);
	    	            case 2 -> pet = new Cat(name, age);
	    	            case 3 -> pet = new Bird(name, age);
	    	            default -> {
	    	                System.out.println("Invalid choice!");
	    	                System.exit(0);
	    	            }
	    	        }

	    	        int action;
	    	        do {
	    	            System.out.println("\nChoose Action:");
	    	            System.out.println("1. Feed");
	    	            System.out.println("2. Play");
	    	            System.out.println("3. Sleep");
	    	            System.out.println("4. Make Sound");
	    	            System.out.println("5. Show Status");
	    	            System.out.println("0. Exit");

	    	            action = sc.nextInt();

	    	            switch (action) {
	    	                case 1 -> pet.feed();
	    	                case 2 -> pet.play();
	    	                case 3 -> pet.sleep();
	    	                case 4 -> pet.makeSound();
	    	                case 5 -> pet.showStatus();
	    	                case 0 -> System.out.println("Thanks for using PetPal");
	    	                default -> System.out.println("Invalid action!");
	    	            }
	    	        } while (action != 0);

	    	        sc.close();
	    	    }
	   
}