
import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sin, cos and tan
    public static double[] calculateTrigonometricFunctions(double angle) {

        double[] result = new double[3];

        // Convert degree to radian
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        result[0] = Math.sin(radians);  // sine
        result[1] = Math.cos(radians);  // cosine
        result[2] = Math.tan(radians);  // tangent

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double angle = input.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value is: " + values[0]);
        System.out.println("Cosine value is: " + values[1]);
        System.out.println("Tangent value is: " + values[2]);

        input.close();
    }
}
