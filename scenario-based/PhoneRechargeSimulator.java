import java.util.Scanner;
public class PhoneRechargeSimulator{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     double balance =0;
     char choice;

        do {
            System.out.println("\n----- Phone Recharge Simulator -----");

            System.out.print("Enter Mobile Operator (Airtel / Jio / Vi): ");
            String operator = input.next();

            System.out.print("Enter Recharge Amount: ₹");
            double amount = input.nextDouble();

            // Add recharge to balance
            balance += amount;

            // Display offers using switch
            switch (operator.toLowerCase()) {
                case "airtel":
                    System.out.println("Airtel Offer: Get 1GB extra data!");
                    break;

                case "jio":
                    System.out.println("Jio Offer: Unlimited calls for 2 days!");
                    break;

                case "vi":
                    System.out.println("VI Offer: 100 SMS free!");
                    break;

                default:
                    System.out.println("Invalid Operator! No offer applied.");
            }
    System.out.println("Current Balance: Rs" + balance);

            // Ask for another recharge
            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator");
        input.close();
    }
}
