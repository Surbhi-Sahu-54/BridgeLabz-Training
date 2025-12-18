// Create VoteEligible class to check either the person can vote or not on the basis of their age 
import java.util.Scanner;

public class VoteEligible{
      public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your age");
         int age = input.nextInt();
          
          // check the age of the person
          if(age>=18){
          System.out.println("The person's age is " + age + " and can vote");
          }else{
          System.out.println(" The person's age is " + age + " and cannot vote");
          }
           input.close();
}
}
          
         