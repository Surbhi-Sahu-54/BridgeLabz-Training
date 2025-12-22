import java.util.Scanner;

public class NumberCheck {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to compare two numbers
      public static int compare(int num1, int num2) {

        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // array of 5 numbers
        int[] numbers = new int[5];

        // take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        // check each number
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last element:");

        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }
}
