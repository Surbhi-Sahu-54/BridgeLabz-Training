// Create class Calculator to perform basic operation (+,-,*,/) on two numbers by using switch case

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first number: ");
         double first = input.nextDouble();

         System.out.print("Enter second number: ");
         double second = input.nextDouble();

         System.out.print("Enter operator (+ - * /): ");
         String operator = input.next();

          // apply switch case on the operator 
        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}

