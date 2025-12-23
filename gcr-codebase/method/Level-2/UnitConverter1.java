public class UnitConvertor1 {

    // convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }

    // convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }

    // convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }

    // convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters;
    }
}

