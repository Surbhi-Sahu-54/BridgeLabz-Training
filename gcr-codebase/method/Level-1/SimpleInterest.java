// create a class SimpleInterest to calculate the interest by using method

import java.util.Scanner;
   public class SimpleInterest{

     // create method to calculate Simple interest
         public static double calculateSI(doule principal , double rate, double time ){
         return(principal*rate*time)/100;
         }
       
         public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         // take input from the user 
         System.out.println("Enter Principal amount");
         double principal = input.nextDouble();

         System.out.println("Enter Rate of intrest");
         double rate = input.nextDouble();

         System.out.println("Enter Time");
         double time = input.nextDouble();

         double simpleInterest = calculteSI(principal,rate,time);

         System.out.println(" the Simple interest is "+  simpleInterest + " for principal " + principal + " rate of interest " + rate +  "and time " + time);

     input.close();
   }
}