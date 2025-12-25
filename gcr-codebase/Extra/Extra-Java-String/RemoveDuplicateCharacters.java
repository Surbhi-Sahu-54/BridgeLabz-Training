//create a class to remove duplicate  from a strng 

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

       // take input from user 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}
