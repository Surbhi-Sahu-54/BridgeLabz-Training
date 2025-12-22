// create a class ChocolateDistribution to get no. of chocolates each child get and chocolate remain

import java.util.Scanner;

public class ChocolateDistribution {
    
    public static void main(String[] args) {
       
        //take input from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
         System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            
            int chocolatesPerChild = result[0];  // Quotient
            int remainingChocolates = result[1]; // Remainder
            
            System.out.println("Each child gets: " + chocolatesPerChild + " chocolate");
            System.out.println("Remaining chocolates  " + remainingChocolates + " chocolate");
            
                   
        input.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Each child gets this many
        int remainder = number % divisor; // Leftover chocolates
        
        return new int[]{quotient, remainder};
    }
}