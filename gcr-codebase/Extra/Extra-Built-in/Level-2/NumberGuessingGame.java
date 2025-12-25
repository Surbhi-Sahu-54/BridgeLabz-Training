import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate computer guess
    static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    static char getFeedback(Scanner input) {
        System.out.print("Enter feedback (h = high, l = low, c = correct): ");
        return input.next().toLowerCase().charAt(0);
    }

    // Method to update range based on feedback
    static int[] updateRange(char feedback, int guess, int low, int high) {
        if (feedback == 'h') {
            high = guess - 1;
        } else if (feedback == 'l') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int low = 1;
        int high = 100;
        char feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess: " + guess);

            feedback = getFeedback(input);

            if (feedback == 'c') {
                System.out.println("🎉 Yay! I guessed your number correctly!");
                break;
            }

            int[] range = updateRange(feedback, guess, low, high);
            low = range[0];
            high = range[1];
        }

        input.close();
    }
}
