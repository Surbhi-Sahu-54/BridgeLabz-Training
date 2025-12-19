// create a class LeapYearIfelse to find the leap year 
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
       // take input from the user as year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // logic using if else 
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
        input.close();  
    }
}
