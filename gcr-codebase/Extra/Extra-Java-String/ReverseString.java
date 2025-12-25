//create a class ReverseString to reverse a given string 

import java.util.Scanner;
   public class ReverseString {

       // Method to reverse a string
       static String reverseString(String str) {
       String reversed = "";

       for (int i = str.length() - 1; i >= 0; i--) {
        reversed = reversed + str.charAt(i);
        }

        return reversed;
        }

      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String input = input.nextLine();

         String result = reverseString(input);

         System.out.println("Reversed String: " + result);
    }
}
