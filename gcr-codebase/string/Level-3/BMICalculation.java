import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI and Status for one person
    public static String[] calculateBMIStatus(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Determine BMI Status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Store BMI and Status in String array
        String[] result = new String[2];
        result[0] = String.format("%.2f", bmi); // BMI upto 2 decimals
        result[1] = status;

        return result;
    }

    // Method to create final 2D String array with Height, Weight, BMI, Status
    public static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIStatus(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiResult[0];
            report[i][3] = bmiResult[1];
        }

        return report;
    }

    // Method to display result in tabular format
    public static void displayReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t\t" +
                    report[i][3]
            );
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] data = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        // Generate BMI Report
        String[][] report = generateBMIReport(data);

        // Display Report
        displayReport(report);

        input.close();
    }
}
