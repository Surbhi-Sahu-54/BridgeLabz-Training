public class UnitConvertor3 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        return cm;
    }
}
