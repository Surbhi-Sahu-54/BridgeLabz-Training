import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        // Recursive call
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {

        int sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {

            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Compare both results
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct and equal");
            } else {
                System.out.println("Results are not equal");
            }
        }

        input.close();
    }
}
