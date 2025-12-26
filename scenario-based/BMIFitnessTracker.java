import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        // Determining BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }
        input.close();
    }
}
