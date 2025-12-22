import java.util.Scanner;

public class FactorsUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial maximum size for factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];

        // Index to store factors
        int index = 0;

        // Loop from 1 to number to find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // If array is full, increase its size
                if (index == maxFactor) {

                    // Double the size
                    maxFactor = maxFactor * 2;

                    // Create temporary array
                    int[] temp = new int[maxFactor];

                    // Copy old values
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temp array back to factors
                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
