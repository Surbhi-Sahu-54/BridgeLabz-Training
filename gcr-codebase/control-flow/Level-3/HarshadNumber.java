// create a class HarshadNumber to check the number whether it is harshad number or not 

import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
       
        // take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        if (original % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        input.close();
    }
}
