// Create a ArmstrongNumber class to check the number is armstrong or not 

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        //take input from the user 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;
 
         // logic using while loop 
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        input.close();
    }
}
