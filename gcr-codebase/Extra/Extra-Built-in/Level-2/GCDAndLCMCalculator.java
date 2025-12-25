// crate a class GCDAndLCMCalculator  to calculate greatest common divisor and least common multiple of two number 
import java.util.Scanner;

public class GCDAndLCMCalculator {

    static int[] getInput() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = input.nextInt();

    System.out.print("Enter second number: ");
    int b = input.nextInt();

    return new int[] { a, b };
    }
    static int calculateGCD(int a, int b) {

     if (b == 0) {
     return a;
   }
    return calculateGCD(b, a % b);
   }
    static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
 }
    static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
       // Take input from user
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive numbers only.");
        } else {
            // Calculate GCD and LCM
            int gcd = calculateGCD(a, b);
            int lcm = calculateLCM(a, b);

        displayResult(a, b, gcd, lcm);
        }
    }
}
