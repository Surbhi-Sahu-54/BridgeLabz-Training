// create a class to  to check the natural number and calculate the sum of n natural numbers by using while loop

import java.util.Scanner;

public class SumOfNaturalNumber{
     public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
       
        // check if the no. is natural or not  
        if(number<=0){
        System.out.println("Please enter valid nstural number");
        }else{
          int sum =0;
          int i=1;
        while(i<=n){
         sum =sum+i;
          i++;

         int sumFormula = number *(number +1)/2;
            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula   = " + sumFormula);
        
         if(sum== sumFormula){
           System.out.println("Both results are correct);
        }else{
         System..out.println("Result not match");
         }
        }
        input.close();
}
}
