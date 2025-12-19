// create a class FriendsAgeHeight to find the youngest friend based on their height and age 
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age ");
        int anthonyAge = input.nextInt();

        // Input heights
        System.out.print("Enter Amar's height ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height");
        double anthonyHeight = input.nextDouble();

        // Find youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Find tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        input.close();
    }
}
