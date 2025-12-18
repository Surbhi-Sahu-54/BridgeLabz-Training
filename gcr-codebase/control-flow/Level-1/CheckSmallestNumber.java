//creating a program to check that the first number is smallest or not
import java.util.Scanner;

public class CheckSmallestNumber{
     public static void main(String[] args){
         
        //create a scanner object
         Scanner input = new Scanner(System.in);
         
        // take input values from the user
         System.out .println("Enter first number");
         double number1 = input.nextDouble();
         System.out.println("Enter second number");
         double number2 = input.nextDouble();
         System.out.println("Enter third number");
         double number3 = input.nextDouble();

         // check if the 1st number is small and print yes or no
         if(number1<number2 &&number1 <number3){
         System.out.println( " First number is the smallest");
         }
         else {
         System.out.println( " No, the first number is not smallest");
         } 
        
         // closing the Scanner stream
         input.close();
}
}








