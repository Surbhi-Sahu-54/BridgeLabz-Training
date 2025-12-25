//create a class FibonacciSequence to calculate and print fibonaccisequence 

import java.util.Scanner;

public class FibonacciSequence {

    // Function to generate and print Fibonacci sequence
    static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {
         System.out.print(a + " ");
          int next = a + b;
           a = b;
           b = next;
          }
        }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(n);
        }

        input.close();
    }
}
