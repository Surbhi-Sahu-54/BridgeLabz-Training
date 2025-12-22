public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    // Column 0 → Old Salary
    // Column 1 → Years of Service
    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2];

        for (int i = 0; i < size; i++) {

            // 5-digit salary between 10000 and 99999
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // years of service between 1 and 10
            data[i][1] = (int) (Math.random() * 10) + 1;
        }

        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → Old Salary
    // Column 1 → Bonus
    // Column 2 → New Salary
    public static double[][] calculateBonus(double[][] empData) {

        double[][] result = new double[empData.length][3];

        for (int i = 0; i < empData.length; i++) {

            double oldSalary = empData[i][0];
            double years = empData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    // Method to display totals in tabular format
    public static void displaySummary(double[][] empData, double[][] salaryData) {

        double totalOldSalary = 0;
        double totalNewSa
