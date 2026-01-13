package trafficmanager;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Roundabout roundabout = new Roundabout();

	        System.out.print("Enter waiting queue capacity: ");
	        int capacity = sc.nextInt();
	        sc.nextLine();

	        WaitingQueue waitingQueue = new WaitingQueue(capacity);

	        while (true) {
	            System.out.println("\n===== Traffic Manager Menu =====");
	            System.out.println("1. Vehicle arrives (add to queue)");
	            System.out.println("2. Allow vehicle to enter roundabout (from queue)");
	            System.out.println("3. Vehicle exits roundabout");
	            System.out.println("4. Print roundabout state");
	            System.out.println("5. Print waiting queue state");
	            System.out.println("6. Print full system status");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter vehicle number: ");
	                    String v1 = sc.nextLine();
	                    waitingQueue.enqueue(v1);
	                    break;

	                case 2:
	                    String vehicleToEnter = waitingQueue.dequeue();
	                    if (vehicleToEnter != null) {
	                        roundabout.addVehicle(vehicleToEnter);
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter vehicle number to exit: ");
	                    String v2 = sc.nextLine();
	                    roundabout.removeVehicle(v2);
	                    break;

	                case 4:
	                    roundabout.printRoundabout();
	                    break;

	                case 5:
	                    waitingQueue.printQueue();
	                    break;

	                case 6:
	                    System.out.println("\n----- Full System Status -----");
	                    System.out.println("Vehicles inside roundabout: " + roundabout.countVehicles());
	                    System.out.println("Vehicles waiting in queue: " + waitingQueue.getSize());
	                    roundabout.printRoundabout();
	                    waitingQueue.printQueue();
	                    break;

	                case 7:
	                    System.out.println("Program ended.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
