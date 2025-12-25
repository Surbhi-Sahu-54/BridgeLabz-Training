import java.util.Scanner;

public class MaximumOfThree {

    // Method to take input from the user
    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = input.nextInt();

        return numbers;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }

        return max;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = takeInput();
        int maximum = findMaximum(nums);

        System.out.println("Maximum of the three numbers is: " + maximum);
    }
}
