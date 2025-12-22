import java.util.Scanner;

public class StoreAndSumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of size 10
        double[] numbers = new double[10];

        // Total sum variable
        double total = 0.0;

        // Index for array
        int index = 0;

        // Infinite while loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Check stopping conditions
            if (input <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            // Store value in array
            numbers[index] = input;
            index++;
        }

        // Display stored numbers and calculate sum
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        // Display total
        System.out.println("\nSum of all numbers = " + total);

        sc.close();
    }
}
