import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Constants for discount rates
    private static final double DISCOUNT20 = 0.20;
    private static final double DISCOUNT10 = 0.10;
    private static final double DISCOUNT5  = 0.05;

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // Ask for number of items
        System.out.print("Enter number of items: ");
        int numberOfItems = input.nextInt();

        double totalBill = 0.0;

        // Input item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = input.nextDouble();
            totalBill += price;
        }

        double discount = 0.0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_5;
        } else {
            discount = 0.0;
        }

        double finalAmount = totalBill - discount;

        // Display results
        System.out.println("\n------ BILL DETAILS ------");
        System.out.println("Total Bill Amount: Rs" + totalBill);
        System.out.println("Discount Applied: Rs" + discount);
        System.out.println("Final Amount to Pay: Rs" + finalAmount);

        input.close();
    }
}
