import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.println("Enter a number (0 to stop): ");
        double number = input.nextDouble();

        while (number != 0) {
            total = total + num;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        System.out.println("Total sum = " + total);

        input.close();
    }
}
