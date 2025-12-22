import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for Natural Number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        // Create arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        // Index variables
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        input.close();
    }
}
