import java.util.Scanner;

public class QuotientAndRemainder {
    
    public static void main(String[] args) {
        // take input from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number (dividend): ");
        int number = input.nextInt();
        
        System.out.print("Enter the second number (divisor): ");
        int divisor = input.nextInt();
        
        if (divisor == 0){
        System.out.println("Error: Cannot divide by zero!");
        } else {
         
        //call method 
         int[] result = findRemainderAndQuotient(number, divisor);
            
          int quotient = result[0];
          int remainder = result[1];
            
          System.out.println("Quotient = " + quotient);
          System.out.println("Remainder = " + remainder);
            
          System.out.println(number + " = " + divisor + " × " + quotient + " + " + remainder);
        }
        
        input.close();
    }
    
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Integer division gives quotient
        int remainder = number % divisor;  // Modulo operator gives remainder
        
        // Return both values in an array
        return new int[]{quotient, remainder};
    }
}