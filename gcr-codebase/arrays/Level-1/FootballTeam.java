import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];

        double sum = 0.0;

        // Taking input from the user
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Calculating sum of heights
        for (int i = 0; i < 11; i++) {
            sum = sum + heights[i];
        }

        // Calculating mean height
        double mean = sum / 11;

        // Display result
        System.out.println("\nMean height of the football team = " + mean);

        input.close();
    }
}
