//create a class Factorial to calculate the factorial of a number using recursion 

import java.util.Scanner;

public class Factorial {

        static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }

     static long calculateFactorial(int n) {

        if (n == 0 || n == 1) {
          return 1;
        }
       return n * calculateFactorial(n - 1);
     }

     static void displayResult(int num, long result) {
     System.out.println("Factorial of " + num + " is: " + result);
    }

     public static void main(String[] args) {
     int number = getInput();

     if (number < 0) {
      System.out.println("Factorial is not defined for negative numbers.");
    } else {
           
     // Calculate factorial using recursion
      long factorial = calculateFactorial(number);
      displayResult(number, factorial);
        }
    }
}
