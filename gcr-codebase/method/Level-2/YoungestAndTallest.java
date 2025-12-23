import java.util.Scanner;

public class YoungestAndTallest {

    // method to find youngest friend
    public static void findYoungest(int[] age, String[] names) {

        int minAge = age[0];
        int index = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                index = i;
            }
        }

        System.out.println("Youngest friend is: " + names[index]
                + " with age " + minAge);
    }

    // method to find tallest friend
    public static void findTallest(double[] height, String[] names) {

        double maxHeight = height[0];
        int index = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                index = i;
            }
        }

        System.out.println("Tallest friend is: " + names[index]
                + " with height " + maxHeight);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // take input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = input.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            height[i] = input.nextDouble();
        }

        // method calls
        findYoungest(age, names);
        findTallest(height, names);
    }
}
