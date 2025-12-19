// program for the sum of natural number using for loop and compute result

import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if n is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {

            // Sum using for loop
            int sumF = 0;

            for (int i = 1; i <= n; i++) {
                sumF = sumF + i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop = " + sumF);
            System.out.println("Sum using formula = " + sumFormula);

            // Compare results
            if (sumF == sumFormula) {
                System.out.println("Both answers are correct");
            } else {
                System.out.println("Result are not match");
            }
        }

        input.close();
    }
}
