package generics.smartwarehousemanagementsystem;
import java.util.*;

public class WareHouseMain {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
            Storage<Electronics> electronicsStorage = new Storage<>();
	        Storage<Groceries> groceriesStorage = new Storage<>();
	        Storage<Furniture> furnitureStorage = new Storage<>();

	        while (true) {
	            System.out.println("\nSmart Warehouse Management System");
	            System.out.println("1. Add Electronics");
	            System.out.println("2. Add Groceries");
	            System.out.println("3. Add Furniture");
	            System.out.println("4. Remove Item");
	            System.out.println("5. Search Item");
	            System.out.println("6. Display All Items");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter Item ID: ");
	                String id = sc.nextLine();

	                System.out.print("Enter Item Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Warranty Months: ");
	                int w = sc.nextInt();

	                electronicsStorage.addItem(new Electronics(id, name, w));

	            } else if (ch == 2) {
	                System.out.print("Enter Item ID: ");
	                String id = sc.nextLine();

	                System.out.print("Enter Item Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Expiry Date: ");
	                String exp = sc.nextLine();

	                groceriesStorage.addItem(new Groceries(id, name, exp));

	            } else if (ch == 3) {
	                System.out.print("Enter Item ID: ");
	                String id = sc.nextLine();

	                System.out.print("Enter Item Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Material: ");
	                String material = sc.nextLine();

	                furnitureStorage.addItem(new Furniture(id, name, material));

	            } else if (ch == 4) {
	                System.out.println("Remove from:");
	                System.out.println("1. Electronics");
	                System.out.println("2. Groceries");
	                System.out.println("3. Furniture");
	                System.out.print("Enter option: ");
	                int opt = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Item ID to remove: ");
	                String id = sc.nextLine();

	                if (opt == 1) electronicsStorage.removeItem(id);
	                else if (opt == 2) groceriesStorage.removeItem(id);
	                else if (opt == 3) furnitureStorage.removeItem(id);
	                else System.out.println("Invalid option");

	            } else if (ch == 5) {
	                System.out.println("Search in:");
	                System.out.println("1. Electronics");
	                System.out.println("2. Groceries");
	                System.out.println("3. Furniture");
	                System.out.print("Enter option: ");
	                int opt = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Item ID to search: ");
	                String id = sc.nextLine();

	                WarehouseItem item = null;

	                if (opt == 1) item = electronicsStorage.searchItem(id);
	                else if (opt == 2) item = groceriesStorage.searchItem(id);
	                else if (opt == 3) item = furnitureStorage.searchItem(id);
	                else System.out.println("Invalid option");

	                if (item == null) System.out.println("Item not found.");
	                else item.displayDetails();

	            } else if (ch == 6) {
	                System.out.println("\nElectronics Items:");
	                Storage.displayAll(electronicsStorage);

	                System.out.println("\nGroceries Items:");
	                Storage.displayAll(groceriesStorage);

	                System.out.println("\nFurniture Items:");
	                Storage.displayAll(furnitureStorage);

	            } else if (ch == 7) {
	                System.out.println("Exit");
	                break;

	            } else {
	                System.out.println("Invalid choice");
	            }
	        }
	    }

}
