// create a class GreatestFactor  to print the greatest factor of a number using a while loop

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for valid input
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {

            int greatestFactor = 1;
            int counter = number - 1;

            // Find greatest factor using while loop
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;   // stop when greatest factor is found
                }
                counter--;
            }

            System.out.println("Greatest factor of " + number +
                               " besides itself is: " + greatestFactor);
        }

        input.close();
    }
}
