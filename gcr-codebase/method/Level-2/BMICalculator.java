import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in 2D array
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];      // weight in kg
            double heightCm = data[i][1];    // height in cm

            // convert height from cm to meter
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            // store BMI in 3rd column
            data[i][2] = bmi;
        }
    }

    // Method to find BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns (weight, height, BMI)
        double[][] data = new double[10][3];

        // Take user input
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
            data[i][0] = input.nextDouble();

            System.out.println("Enter height (cm) of person " + (i + 1) + ":");
            data[i][1] = input.nextDouble();
        }

        // calculate BMI
        calculateBMI(data);

        // get BMI status
        String[] status = getBMIStatus(data);

        // display result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    status[i]);
        }
    }
}
