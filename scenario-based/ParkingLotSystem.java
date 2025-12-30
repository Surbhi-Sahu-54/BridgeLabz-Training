import java.util.Scanner;

public class ParkingLotSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalSlots = 5;     // total parking capacity
        int occupiedSlots = 0; // currently occupied slots
        int choice;

        System.out.println("Welcome to Smart Parking Lot System");

        // while loop runs until parking lot is full
        while (occupiedSlots < totalSlots) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");

            choice = input.nextInt();

            switch (choice) {

                case 1: // Park
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking Lot is Full!");
                    }
                    break;

                case 2: // Exit
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking Lot is already empty.");
                    }
                    break;

                case 3: // Show Occupancy
                    System.out.println("Occupied Slots: " + occupiedSlots);
                    System.out.println("Available Slots: " + (totalSlots - occupiedSlots));
                    break;

                case 4: // Exit System
                    System.out.println("Exiting Parking System. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("\n Parking Lot is FULL. No more vehicles can be parked.");
        input.close();
    }
}
