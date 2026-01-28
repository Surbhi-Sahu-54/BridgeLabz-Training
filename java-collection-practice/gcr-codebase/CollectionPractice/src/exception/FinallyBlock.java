package exception;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = input.nextInt();
            System.out.print("Enter denominator: ");
            int den = input.nextInt();
            System.out.println("Result: " + (num / den));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            input.close();
        }
    }
}