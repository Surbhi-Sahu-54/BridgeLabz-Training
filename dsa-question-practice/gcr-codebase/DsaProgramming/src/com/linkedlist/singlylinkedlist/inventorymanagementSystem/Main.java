package com.linkedlist.singlylinkedlist.inventorymanagementSystem;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        InventoryLinkedList inventory = new InventoryLinkedList();
	        int choice;

	        do {
	            System.out.println("\n===== Inventory Management =====");
	            System.out.println("1. Add Item at Beginning");
	            System.out.println("2. Add Item at End");
	            System.out.println("3. Add Item at Position");
	            System.out.println("4. Remove Item by ID");
	            System.out.println("5. Update Quantity");
	            System.out.println("6. Search by ID");
	            System.out.println("7. Search by Name");
	            System.out.println("8. Display All Items");
	            System.out.println("9. Total Inventory Value");
	            System.out.println("10. Sort by Name");
	            System.out.println("11. Sort by Price");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1, 2, 3 -> addItem(sc, inventory, choice);
	                case 4 -> {
	                    System.out.print("Enter Item ID: ");
	                    inventory.removeByItemId(sc.nextInt());
	                }
	                case 5 -> {
	                    System.out.print("Enter Item ID: ");
	                    int id = sc.nextInt();
	                    System.out.print("Enter new Quantity: ");
	                    inventory.updateQuantity(id, sc.nextInt());
	                }
	                case 6 -> {
	                    System.out.print("Enter Item ID: ");
	                    inventory.searchById(sc.nextInt());
	                }
	                case 7 -> {
	                    sc.nextLine();
	                    System.out.print("Enter Item Name: ");
	                    inventory.searchByName(sc.nextLine());
	                }
	                case 8 -> inventory.displayAll();
	                case 9 -> inventory.calculateTotalValue();
	                case 10 -> {
	                    System.out.print("1.Ascending  2.Descending: ");
	                    inventory.sortByName(sc.nextInt() == 1);
	                }
	                case 11 -> {
	                    System.out.print("1.Ascending  2.Descending: ");
	                    inventory.sortByPrice(sc.nextInt() == 1);
	                }
	                case 0 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice");
	            }
	        } while (choice != 0);

	        sc.close();
	    }

	    private static void addItem(Scanner sc, InventoryLinkedList inv, int type) {
	        System.out.print("Item ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Item Name: ");
	        String name = sc.nextLine();

	        System.out.print("Quantity: ");
	        int qty = sc.nextInt();

	        System.out.print("Price: ");
	        double price = sc.nextDouble();

	        if (type == 1)
	            inv.addAtBeginning(id, name, qty, price);
	        else if (type == 2)
	            inv.addAtEnd(id, name, qty, price);
	        else {
	            System.out.print("Position: ");
	            inv.addAtPosition(sc.nextInt(), id, name, qty, price);
	        }
	    }
}
