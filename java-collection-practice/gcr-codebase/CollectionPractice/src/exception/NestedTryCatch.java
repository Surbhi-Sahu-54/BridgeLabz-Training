package exception;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {100, 250, 390, 400, 590};

        try {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                System.out.println("Result: " + (array[index] / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close();
        }
    }
}
