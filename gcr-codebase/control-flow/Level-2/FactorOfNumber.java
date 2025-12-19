// create program to find the factor of number by using for loop
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            // Find factors using for loop
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
