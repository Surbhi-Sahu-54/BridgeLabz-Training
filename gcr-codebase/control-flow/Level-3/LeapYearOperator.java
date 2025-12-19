//create a class LeapYearIfelse to find the leap year by using logical AND OR operators  

import java.util.Scanner;
public class LeapYearOperator{
      public static void main(String[] args){
 
           // take input from the user 
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the year");
           double year = input.nextDouble();

           // if condition using AND and OR operators
           if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
           System.out.println("this is a leap year");
           }else{
           System.out.println("This is not a leap year");
           }

           input.close();
}
}  
           