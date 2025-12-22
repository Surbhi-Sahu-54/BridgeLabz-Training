// create a class to calculate the wind chill temperature 

import java.util.Scanner;

public class WindChillTemperature {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 
                + 0.6215 * temperature 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

       // take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double windSpeed = input.nextDouble();

        double result = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature is: " + result);

        input.close();
    }
}
