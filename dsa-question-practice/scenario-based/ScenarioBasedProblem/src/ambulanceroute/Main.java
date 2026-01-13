package ambulanceroute;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        CircularHospitalRoute route = new CircularHospitalRoute();

	        // Default Units
	        route.addUnit("Emergency");
	        route.addUnit("Radiology");
	        route.addUnit("Surgery");
	        route.addUnit("ICU");

	        while (true) {
	            System.out.println("\n===== AMBULANCE ROUTE MENU =====");
	            System.out.println("1. Show Hospital Units");
	            System.out.println("2. Redirect Patient (Find nearest available)");
	            System.out.println("3. Set Unit Available/Unavailable");
	            System.out.println("4. Remove Unit (Maintenance)");
	            System.out.println("5. Add New Unit");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    route.displayUnits();
	                    break;

	                case 2: {
	                    System.out.print("Enter patient name: ");
	                    String patient = sc.nextLine();

	                    System.out.print("Enter starting unit name (like Emergency): ");
	                    String start = sc.nextLine();

	                    route.redirectPatient(patient, start);
	                    break;
	                }

	                case 3: {
	                    System.out.print("Enter unit name: ");
	                    String unit = sc.nextLine();

	                    System.out.print("Set available? (true/false): ");
	                    boolean status = sc.nextBoolean();

	                    route.setAvailability(unit, status);
	                    break;
	                }

	                case 4: {
	                    System.out.print("Enter unit name to remove: ");
	                    String removeUnit = sc.nextLine();

	                    route.removeUnit(removeUnit);
	                    break;
	                }

	                case 5: {
	                    System.out.print("Enter new unit name to add: ");
	                    String newUnit = sc.nextLine();
	                    route.addUnit(newUnit);
	                    break;
	                }

	                case 6:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
