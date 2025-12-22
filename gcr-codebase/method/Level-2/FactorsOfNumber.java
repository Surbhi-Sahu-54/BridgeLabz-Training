import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop → count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with size = number of factors
        int[] factors = new int[count];

        int index = 0;

        // Second loop → store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {

        double sumOfSquares = 0;

        for (int i = 0; i < factors.length; i++) {
            sumOfSquares = sumOfSquares + Math.pow(factors[i], 2);
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        input.close();
    }
}
