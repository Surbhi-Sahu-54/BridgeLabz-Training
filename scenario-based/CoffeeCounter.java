import java.util.Scanner;

public class CoffeeCounter{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double GST_RATE = 0.18;   // 18% GST
        double pricePerCup = 0;
        double totalBill, gstAmount, finalAmount;

        System.out.println(" Welcome to Ravi's Coffee Cafe");

        while (true) {

            System.out.println("\nAvailable Coffees:");
            System.out.println("1. Espresso");
            System.out.println("2. Cappuccino");
            System.out.println("3. Latte");
            System.out.println("4. Americano");
            System.out.println("Type 'exit' to stop");

            System.out.print("\nEnter coffee type: ");
            String coffeeType = input.next().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe");
                break;
            }

            // Decide price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 100;
                    break;

                case "cappuccino":
                    pricePerCup = 150;
                    break;

                case "latte":
                    pricePerCup = 180;
                    break;

                case "americano":
                    pricePerCup = 120;
                    break;

                default:
                    System.out.println("Invalid coffee type! Please try again.");
                    continue; // Skip rest and take new order
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero!");
                continue;
            }

            // Bill calculation
            totalBill = pricePerCup * quantity;
            gstAmount = totalBill * GST_RATE;
            finalAmount = totalBill + gstAmount;

            // Output
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Price per cup: Rs." + pricePerCup);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: Rs." + totalBill);
            System.out.println("GST (18%): Rs." + gstAmount);
            System.out.println("Final Amount: Rs." + finalAmount);
        }

        input.close();
    }
}
