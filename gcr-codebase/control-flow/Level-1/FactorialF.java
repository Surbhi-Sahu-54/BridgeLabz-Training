//create FactorialF class to find the factorial of positive number by using for LOOP
import java.util.Scanner;
public class FactorialF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = input.nextInt();
        int factorial = 1;
        // check the number is positive and apply for loop  
        if(number<=0){
        System.out.println("Factorial is not defined for negative number");
        }else{

        for (int i=1;i<=number;i++){
            factorial *=i;
        }
        }
        System.out.println("Factorial of "+ number + "is:"+ factorial);
    }
}
