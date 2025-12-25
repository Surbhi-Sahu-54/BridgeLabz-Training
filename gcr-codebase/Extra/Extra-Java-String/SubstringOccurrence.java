import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = input.nextLine();

        System.out.print("Enter substring: ");
        String sub = input.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Substring occurs " + count + " times.");
    }
}
