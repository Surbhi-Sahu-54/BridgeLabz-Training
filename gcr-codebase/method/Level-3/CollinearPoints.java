import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1, int x2, int y2, int x3, int y3) {

        // using cross multiplication to avoid division
        int slopeAB = (y2 - y1) * (x3 - x2);
        int slopeBC = (y3 - y2) * (x2 - x1);

        return slopeAB == slopeBC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(
            int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter x1 and y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 and y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 and y3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // slope method check
        if (isCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Using Slope Formula)");
        } else {
            System.out.println("Points are NOT collinear (Using Slope Formula)");
        }

        // area method check
        if (isCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Using Area Formula)");
        } else {
            System.out.println("Points are NOT collinear (Using Area Formula)");
        }
    }
}
