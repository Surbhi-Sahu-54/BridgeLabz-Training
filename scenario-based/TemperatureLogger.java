import java.util.Scanner;
public class TemperatureLogger{
      public static double calculateAverage(double[] temperatures) {
        double sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        return sum / temperatures.length;
    }

 public static double findMaximum(double[] temperatures) {
        double maxTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        return maxTemperature;
    }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] temperatures = new double[7];

        // Input temperatures
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = input.nextDouble();
        }

        double averageTemperature = calculateAverage(temperatures);
        double maximumTemperature = findMaximum(temperatures);

        // Output results
        System.out.println("\nTemperature Report ");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Maximum Temperature: " + maximumTemperature);

        input.close();
    }
}
