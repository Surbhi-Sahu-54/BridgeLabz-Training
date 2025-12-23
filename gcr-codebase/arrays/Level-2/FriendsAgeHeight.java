import java.util.Scanner;

public class FriendsAgeHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter Height (in cm): ");
            heights[i] = sc.nextInt();
        }

        // Initialize youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\n===== RESULT =====");
        System.out.println("Youngest Friend : " + names[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend  : " + names[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
