import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking date input
        System.out.print("Enter date (YYYY-MM-DD): ");
        String inputDate = input.nextLine();

        // Convert input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date   : " + date);
        System.out.println("After Additions : " + updatedDate);
        System.out.println("Final Date      : " + finalDate);

        input.close();
    }
}
