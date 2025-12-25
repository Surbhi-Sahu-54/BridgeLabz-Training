//Create a class to perform basic calculation on two numbers

import java.util.Scanner;

public class BasicCalculator {

  static double add(double a, double b) {
        return a + b;
    }
  static double subtract(double a, double b) {
        return a - b;
    }
  static double multiply(double a, double b) {
        return a * b;
    }
  static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");

        int choice = input.nextInt();

        // Take two numbers from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;

            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + divide(num1, num2));
                }
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
        }

        input.close();
    }
}
