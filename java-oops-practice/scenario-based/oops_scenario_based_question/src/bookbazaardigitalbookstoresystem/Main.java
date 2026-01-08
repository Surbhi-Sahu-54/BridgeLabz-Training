package bookbazaardigitalbookstoresystem;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter book type (1 = EBook, 2 = PrintedBook): ");
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter book title:");
	        String title = sc.nextLine();

	        System.out.println("Enter author name:");
	        String author = sc.nextLine();

	        System.out.println("Enter price:");
	        double price = sc.nextDouble();

	        System.out.println("Enter stock:");
	        int stock = sc.nextInt();

	        Book book;

	        if (choice == 1) {
	            book = new EBook(title, author, price, stock);
	        } else {
	            book = new PrintedBook(title, author, price, stock);
	        }

	        System.out.println("Enter quantity to buy:");
	        int quantity = sc.nextInt();

	        // polymorphism
	        IDiscountable discountBook = (IDiscountable) book;
	        double discountedPrice = discountBook.applyDiscount(price);

	        double totalCost = discountedPrice * quantity;

	        System.out.println("\n--- BILL ---");
	        book.displayBook();
	        System.out.println("Quantity Bought : " + quantity);
	        System.out.println("Discounted Price: " + discountedPrice);
	        System.out.println("Total Cost      : " + totalCost);

	        book.reduceStock(quantity);

	        Order order = new Order("ORD" + System.currentTimeMillis());
	        order.confirmOrder();
	        order.showOrderStatus();

	        sc.close();
	    }
	}
