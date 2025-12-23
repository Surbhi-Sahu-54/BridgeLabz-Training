import java.util.Scanner;

public class ReverseNumberUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Step 2: Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 3: Create array to store digits
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Step 4: Create reverse array
        int[] reverseDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}
