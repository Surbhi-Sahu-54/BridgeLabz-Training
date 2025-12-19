// create FizzBuzz class to print the FizzBuzz according to the multile of 3,5 and both by using while loop
import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0){
            System.out.println("Please enter a valid positive integer.");
        } else {

            int i = 1;

         // logic using while loop
         while (i <= number) {

           if (i % 3 == 0 && i % 5 == 0) {
           System.out.println("FizzBuzz");
           } else if (i % 3 == 0) {
           System.out.println("Fizz");
           } else if (i % 5 == 0) {
           System.out.println("Buzz");
           } else {
           System.out.println(i);
           }

             i++;
            }
        }

        input.close();
    }
}
