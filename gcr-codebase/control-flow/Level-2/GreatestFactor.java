// create a class GreatestFactor  to print the greatest factor of a number using a for loop
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {

            int greatestFactor = 1;

            // Loop from number-1 to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // stop after finding the greatest factor
                }
            }

            System.out.println("Greatest factor of " + number + " besides itself is: " 
                               + greatestFactor);
        }

        input.close();
    }
}
