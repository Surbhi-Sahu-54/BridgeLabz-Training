// create a class to  to check the natural number and calculate the sum of n natural numbers

import java.util.Scanner;

public class NaturalNumber{
     public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
       
        // check if the no. is natural or not  
        if (number>=0){
        int sum = number *(number +1)/2;

        System.out.println("the sum of" + number + "natural numbers is " + sum);
        }
        input.close();
}
}
