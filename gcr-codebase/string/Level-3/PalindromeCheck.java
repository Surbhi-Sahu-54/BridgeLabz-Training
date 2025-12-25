import java.util.Scanner;

public class PalindromeCheck {

    //LOGIC 1: Using start and end index (loop)
    public static boolean isPalindromeUsingLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //LOGIC 2: Using Recursion
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text) {

        int length = text.length();
        char[] reverse = new char[length];

        for (int i = 0; i < length; i++) {
            reverse[i] = text.charAt(length - 1 - i);
        }
        return reverse;
    }

    // LOGIC Using character arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = input.nextLine();

        System.out.println("\nPalindrome Check Results:");

        System.out.println("Using Loop Logic      : " +
                isPalindromeUsingLoop(input));

        System.out.println("Using Recursion Logic : " +
                isPalindromeUsingRecursion(input, 0, input.length() - 1));

        System.out.println("Using Array Logic     : " +
                isPalindromeUsingArray(input));

        input.close();
    }
}
