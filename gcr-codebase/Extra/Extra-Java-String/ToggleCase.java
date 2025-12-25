//create a class ToggleCase to toggle the case ofeach character and convert uppercase letter to lowercase letter 

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        //take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // digits, spaces, symbols
            }
        }

        System.out.println("Toggled String: " + result);
    }
}
