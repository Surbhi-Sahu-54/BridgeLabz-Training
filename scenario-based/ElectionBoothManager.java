import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter voter age (or -1 to exit): ");
            int age = input.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("\nVoting has ended.");
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int vote = input.nextInt();

                // Record vote
                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Candidate A.");
                        break;
                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Candidate B.");
                        break;
                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Candidate C.");
                        break;
                    default:
                        System.out.println("Invalid vote! Vote not recorded.");
                }

            } else {
                System.out.println("Not eligible to vote (Age must be 18 or above).");
            }
        }

        // Final Results
        System.out.println("\n--- Election Results ---");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        input.close();
    }
}
