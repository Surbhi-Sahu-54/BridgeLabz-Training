import java.util.Scanner;

public class CheckDivisiblity {
     public static void main(String[] args){
     
     // take input from the user
     Scanner input = new Scanner(System.in);
      System.out.println("Enter the number");
      double number= input.nextDouble();
  
      if(number%5==0){
      System.out.println("Is the number"+ number + "divisible by 5?" +"Yes");
      } 
      else{
      System.out.println("Is the number"+ number + "divisible by 5?" +"No");
      }
}
}  