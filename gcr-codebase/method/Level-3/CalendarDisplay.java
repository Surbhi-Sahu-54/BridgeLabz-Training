import java.util.Scanner;

public class CalendarDisplay {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to get month name
    public static String getMonthName(int month) {

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to get number of days in month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // check for February leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to get first day of the month (0 = Sunday, 1 = Monday, ...)
    public static int getFirstDay(int month, int year) {

        int d = 1; // first day of month
        int y = year;
        int m = month;

        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;
        int j = y / 100;

        int day = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // convert to Sunday = 0 format
        return (day + 6) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        // display header
        System.out.println("\n    " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // first loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // second loop to print days
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}

