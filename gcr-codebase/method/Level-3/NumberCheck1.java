import java.util.Scanner;

public class NumberCheck1 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Method to check Duck number
    // Duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }

        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digit
    public static void findLargestSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }

    // Method to find smallest and second smallest digit
    public static void findSmallestSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Second smallest digit = " + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("\nNumber of digits = " + digitCount);

        System.out.print("Digits are: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println();

        // Duck number check
        if (isDuckNumber(digits)) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is NOT a Duck Number");
        }

        // Armstrong number check
        if (isArmstrong(number, digits)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is NOT an Armstrong Number");
        }

        // Largest and second largest
        findLargestSecondLargest(digits);

        // Smallest and second smallest
        findSmallestSecondSmallest(digits);
    }
}
