package callcenter;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    	
	       Scanner sc = new Scanner(System.in);
	       CallCenterManager manager = new CallCenterManager();
	             while (true) {
	    	            System.out.println("\n===== CALL CENTER MENU =====");
	    	            System.out.println("1. Add Incoming Call");
	    	            System.out.println("2. Handle Next Call");
	    	            System.out.println("3. Show Call Statistics");
	    	            System.out.println("4. Exit");
	    	            System.out.print("Choose option: ");

	    	            int choice = sc.nextInt();
	    	            sc.nextLine(); // clear buffer

	    	            switch (choice) {

	    	                case 1:
	    	                    System.out.print("Enter Customer ID: ");
	    	                    int id = sc.nextInt();
	    	                    sc.nextLine();

	    	                    System.out.print("Enter Customer Name: ");
	    	                    String name = sc.nextLine();

	    	                    System.out.print("Is VIP? (true/false): ");
	    	                    boolean isVIP = sc.nextBoolean();

	    	                    Customer customer = new Customer(id, name, isVIP);
	    	                    manager.addCall(customer);
	    	                    break;

	    	                case 2:
	    	                    manager.handleCall();
	    	                    break;

	    	                case 3:
	    	                    manager.showCallStats();
	    	                    break;

	    	                case 4:
	    	                    System.out.println("Exiting Call Center System...");
	    	                    sc.close();
	    	                    return;

	    	                default:
	    	                    System.out.println("Invalid choice!");
	    	            }
	    	        }
	             }
}
