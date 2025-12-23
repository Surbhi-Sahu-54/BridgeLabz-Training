import java.util.Scanner;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {

        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], 2);
        }

        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {

        int sum = sumOfDigits(digits);

        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find frequency of each digit
    // 2D array: column 0 = digit, column 1 = frequency
    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        // initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // count frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("\nNumber of digits = " + digitCount);

        System.out.print("Digits are: ");
