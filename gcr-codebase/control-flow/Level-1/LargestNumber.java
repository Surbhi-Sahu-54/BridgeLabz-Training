import java.util.Scanner;

public class LargestNumber{
         public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
       // take input values from the user
         System.out.println("Enter first number");
         double number1 = input.nextDouble();
         System.out.println("Enter second number");
         double number2 = input.nextDouble();
         System.out.println("Enter third number");
         double number3 = input.nextDouble();

         if(number1>number2 && number1>number3){
         System.out.println(" first number is largest");
         }
         else if( number2 >number1 && number2>number3){
         System.out.println("Second number is largest");
         }
         else {
          System.out.println("Third number is largest");
         }
         input.close();
}
}
       



