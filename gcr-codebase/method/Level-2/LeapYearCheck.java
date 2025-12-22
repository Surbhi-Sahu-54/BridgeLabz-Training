import java.util.Scanner;

public class LeapYearCheck {

    // method to check leap year
    public static boolean isLeapYear(int year) {

        // condition a and b as given
        if (year >= 1582) {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;   // it is leap year
            } else {
                return false;  // not a leap year
            }

        } else {
            return false; // year is less than 1582
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take year input
        System.out.println("Enter a year:");
        int year = input.nextInt();

        // call method
        boolean result = isLeapYear(year);

        // print result
        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
