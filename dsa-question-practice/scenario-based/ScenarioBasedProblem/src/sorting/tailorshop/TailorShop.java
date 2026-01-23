package sorting.tailorshop;
import java.util.*;

class Order {
    int orderId;
    String customerName;
    String deliveryDate;   // format: DD-MM-YYYY

    Order(int orderId, String customerName, String deliveryDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDate = deliveryDate;
    }
}

public class TailorShop {
    ArrayList<Order> orders = new ArrayList<>();

    void addOrder(int id, String name, String date) {
        orders.add(new Order(id, name, date));
        insertionSortByDate();
        System.out.println("Order added and sorted by delivery deadline.");
    }

    void insertionSortByDate() {
        for (int i = 1; i < orders.size(); i++) {
            Order key = orders.get(i);
            int j = i - 1;

            while (j >= 0 && convertToNumber(orders.get(j).deliveryDate) > convertToNumber(key.deliveryDate)) {
                orders.set(j + 1, orders.get(j));
                j--;
            }
            orders.set(j + 1, key);
        }
    }

    int convertToNumber(String date) {
        String[] parts = date.split("-");
        int dd = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int yy = Integer.parseInt(parts[2]);
        return yy * 10000 + mm * 100 + dd;
    }

    void displayOrders() {
        if (orders.size() == 0) {
            System.out.println("No orders available.");
            return;
        }

        System.out.println("Orders (Sorted by Delivery Date):");
        for (int i = 0; i < orders.size(); i++) {
            Order o = orders.get(i);
            System.out.println((i + 1) + ". OrderID: " + o.orderId + ", Name: " + o.customerName + ", Date: " + o.deliveryDate);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TailorShop ts = new TailorShop();

        while (true) {
            System.out.println("\n1. Add New Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Order ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Delivery Date (DD-MM-YYYY): ");
                String date = sc.nextLine();

                ts.addOrder(id, name, date);

            } else if (ch == 2) {
                ts.displayOrders();

            } else if (ch == 3) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
