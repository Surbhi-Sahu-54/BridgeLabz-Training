import java.util.Scanner;

public class LargestSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Step 2: Store digits dynamically
        while (number != 0) {

            // If array is full, increase size by 10
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                // Copy old array into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign new array
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Step 3: Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 4: Output
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        input.close();
    }
}
