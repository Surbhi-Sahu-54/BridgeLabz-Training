import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine().toLowerCase();

        // Remove spaces (optional but good)
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are NOT Anagrams");
            return;
        }

        int[] freq = new int[256]; // ASCII characters

        // Count characters of first string
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        // Reduce count using second string
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        // Check all counts are zero
        for (int count : freq) {
            if (count != 0) {
                System.out.println("Strings are NOT Anagrams");
                return;
            }
        }

        System.out.println("Strings are Anagrams");
    }
}
