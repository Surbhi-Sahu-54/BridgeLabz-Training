import java.util.Scanner;

public class VotingEligibility {

    // Method to take ages of students and return 1D array
    static int[] getStudentAges(int n) {

        Scanner input = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility
    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";   // invalid age
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";    // can vote
            }
            else {
                result[i][1] = "false";   // cannot vote
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    static void displayResult(String[][] data) {
       for (int i = 0; i < data.length; i++) {
         System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Number of students
        int n = 10;

        // Get ages
        int[] ages = getStudentAges(n);

        // Check voting eligibility
        String[][] result = checkVoting(ages);
 
        displayResult(result);
    }
}
