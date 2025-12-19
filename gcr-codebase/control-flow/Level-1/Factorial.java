// Check the natural number and find factorial using while loop
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = input.nextInt();
       
       //check the natural number and determine factorial
        if(number<=0){
        System.out.println("Factorial is not defined for negative number");
        }else{
        int fact = 1;
        int i =1;
        while(i<=number){
        fact =fact*i;
        i++;
        }
        
        System.out.println("Factorial of "+ number + " is : "+ fact);
       }
       input.close();
  }
}
