// calculate the bonus of employee  based on their services
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0.0;

        // Check bonus eligibility
        if (years > 5) {
            bonus = salary * 0.05;   // 5% bonus
            System.out.println("Employee is eligible for bonus.");
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus.");
            System.out.println("Bonus amount = " + bonus);
        }

        input.close();
    }
}
