//Create a class TemperatureConverter to convert temperature between Fahrenheit and Celsius 
import java.util.Scanner;

public class TemperatureConverter {
  static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
      }
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                double celsius = fahrenheitToCelsius(f);
                System.out.println("Temperature in Celsius: " + celsius);
                break;

            case 2:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                double fahrenheit = celsiusToFahrenheit(c);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }

        input.close();
    }
}
