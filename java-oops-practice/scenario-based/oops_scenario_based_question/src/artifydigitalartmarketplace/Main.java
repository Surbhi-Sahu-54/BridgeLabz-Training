package artifydigitalartmarketplace;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter user name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter wallet balance: ");
	        double balance = sc.nextDouble();

	        User user = new User(name, balance);

	        sc.nextLine(); // buffer clear

	        // Artwork Input
	        System.out.print("Choose art type (1-Digital, 2-Print): ");
	        int choice = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter artwork title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter artist name: ");
	        String artist = sc.nextLine();

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();
	        sc.nextLine();

	        Artwork art;

	        if (choice == 1) {
	            System.out.print("Preview available? (true/false): ");
	            boolean preview = sc.nextBoolean();
	            art = new DigitalArt(title, artist, price, "Digital License", preview);
	        } else {
	            art = new PrintArt(title, artist, price, "Print License");
	        }

	        // Polymorphic calls
	        art.license();
	        art.purchase(user);

	        System.out.println(" Remaining Wallet Balance: " + user.getWalletBalance());
	        sc.close();
	 }
}