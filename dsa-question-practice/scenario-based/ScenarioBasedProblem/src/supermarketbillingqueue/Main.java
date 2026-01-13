package supermarketbillingqueue;
import java.util.*;
public class Main {
	    static Queue<Customer> customerQueue = new LinkedList<>();
	    static HashMap<String, Item> storeItems = new HashMap<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        // Default store items
	        storeItems.put("Milk", new Item("Milk", 50, 10));
	        storeItems.put("Bread", new Item("Bread", 40, 8));
	        storeItems.put("Rice", new Item("Rice", 60, 15));
	        storeItems.put("Sugar", new Item("Sugar", 45, 12));

	        while (true) {
	            System.out.println("\n========== SMART CHECKOUT SYSTEM ==========");
	            System.out.println("1. Add Customer to Queue");
	            System.out.println("2. Serve Next Customer (Billing)");
	            System.out.println("3. View Customer Queue");
	            System.out.println("4. View Store Items (Price + Stock)");
	            System.out.println("5. Add New Store Item");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    addCustomer();
	                    break;

	                case 2:
	                    serveCustomer();
	                    break;

	                case 3:
	                    viewQueue();
	                    break;

	                case 4:
	                    viewStoreItems();
	                    break;

	                case 5:
	                    addNewStoreItem();
	                    break;

	                case 6:
	                    System.out.println("Thank you for using SmartCheckout!");
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }

	    // Add customer dynamically
	    static void addCustomer() {
	        System.out.print("Enter Customer Name: ");
	        String cname = sc.nextLine();

	        Customer customer = new Customer(cname);

	        while (true) {
	            System.out.println("\n--- Add Items to Cart ---");
	            System.out.print("Enter item name (or type 'done' to finish): ");
	            String itemName = sc.nextLine();

	            if (itemName.equalsIgnoreCase("done")) {
	                break;
	            }

	            if (!storeItems.containsKey(itemName)) {
	                System.out.println("Item not available in store!");
	                continue;
	            }

	            System.out.print("Enter quantity: ");
	            int qty = sc.nextInt();
	            sc.nextLine();

	            if (qty <= 0) {
	                System.out.println("Quantity must be greater than 0!");
	                continue;
	            }

	            customer.addItemToCart(itemName, qty);
	            System.out.println("Added to cart");
	        }

	        customerQueue.add(customer);
	        System.out.println("\nCustomer added to Queue");
	    }

	    // Serve customer + billing
	    static void serveCustomer() {
	        if (customerQueue.isEmpty()) {
	            System.out.println("No customers in queue!");
	            return;
	        }

	        Customer customer = customerQueue.poll(); // remove from queue
	        System.out.println("\nServing Customer: " + customer.customerName);

	        double totalBill = 0;

	        System.out.println("\n------ BILL DETAILS ------");

	        for (String itemName : customer.cart.keySet()) {
	            int qty = customer.cart.get(itemName);

	            Item storeItem = storeItems.get(itemName);

	            if (storeItem.stock >= qty) {
	                double cost = storeItem.price * qty;
	                totalBill += cost;

	                // update stock
	                storeItem.stock -= qty;

	                System.out.println(itemName + " x " + qty + " = ₹" + cost);
	            } else {
	                System.out.println(itemName + " -> Not enough stock!");
	                System.out.println("Available stock: " + storeItem.stock);
	            }
	        }

	        System.out.println("--------------------------");
	        System.out.println("Total Bill = ₹" + totalBill);
	        System.out.println("Payment Done Customer Removed from Queue ");
	    }

	    // View queue
	    static void viewQueue() {
	        if (customerQueue.isEmpty()) {
	            System.out.println("Queue is empty!");
	            return;
	        }

	        System.out.println("\n--- Current Queue ---");
	        int count = 1;
	        for (Customer c : customerQueue) {
	            System.out.println(count + ". " + c.customerName);
	            count++;
	        }
	    }

	    //  View store items
	    static void viewStoreItems() {
	        System.out.println("\n--- Store Items ---");
	        for (String key : storeItems.keySet()) {
	            Item item = storeItems.get(key);
	            System.out.println(item.name + " | Price: ₹" + item.price + " | Stock: " + item.stock);
	        }
	    }

	    // Add new item in store
	    static void addNewStoreItem() {
	        System.out.print("Enter new item name: ");
	        String name = sc.nextLine();

	        if (storeItems.containsKey(name)) {
	            System.out.println("Item already exists!");
	            return;
	        }

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter stock: ");
	        int stock = sc.nextInt();
	        sc.nextLine();

	        storeItems.put(name, new Item(name, price, stock));
	        System.out.println("New item added successfully");
	    }
}
