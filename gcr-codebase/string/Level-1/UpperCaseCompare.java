import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert text to uppercase using charAt() and ASCII logic
    static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);   // ASCII logic
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // User-defined uppercase conversion
        String userUpper = convertToUpper(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both strings
        boolean result = compareStrings(userUpper, builtInUpper);

        // Display results
        System.out.println("Uppercase using charAt(): " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results equal? " + result);

        input.close();
    }
}
