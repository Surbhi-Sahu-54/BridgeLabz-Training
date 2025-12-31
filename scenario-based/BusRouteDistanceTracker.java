import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalDistance = 0;
        boolean continueJourney = true;

        while (continueJourney) {
            System.out.print("Enter distance covered for this stop (in km): ");
            double distance = input.nextDouble();

            totalDistance += distance;

            System.out.print("Do you want to get off the bus? (yes/no): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("yes")) {
                continueJourney = false;
            }
        }

        System.out.println("Total distance traveled: " + totalDistance + " km");

        input.close();
    }
}
