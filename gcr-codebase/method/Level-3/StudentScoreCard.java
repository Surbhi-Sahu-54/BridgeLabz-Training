import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM marks
    // Column 0 → Physics, 1 → Chemistry, 2 → Maths
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    // Method to calculate Total, Average and Percentage
    // Column 0 → Total, 1 → Average, 2 → Percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("\nID\tPhysics\tChem\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        // Step 1: Generate PCM scores
        int[][] scores = generatePCMScores(students);

        // Step 2: Calculate total, average & percentage
        double[][] result = calculateResults(scores);

        // Step 3: Display scorecard
        displayScoreCard(scores, result);
    }
}
