import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 10;

        // Arrays
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Total variables
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < size; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println(" Invalid input! Please enter again.");
                i--; // decrement index
                continue;
            }
        }

        // Bonus calculation loop
        for (int i = 0; i < size; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n===== ZARA BONUS SUMMARY =====");
        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

        input.close();
    }
}
