package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SingleSpace {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter count: ");
        int n = input.nextInt();
        input.nextLine(); // Consume leftover newline

        while (n-- > 0) {
            System.out.print("Enter a sentence to to remove extra spaces: ");
            String sentence = input.nextLine();

            String replacedText = sentence.replaceAll(regex, " ");
            System.out.println("Replaced Text: " + replacedText);
        }
        input.close();
    }
}
