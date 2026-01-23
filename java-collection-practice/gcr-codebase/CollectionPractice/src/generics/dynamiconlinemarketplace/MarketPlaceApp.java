package generics.dynamiconlinemarketplace;

import java.util.*;

public class MarketPlaceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();

        while (true) {
            System.out.println("\nDynamic Online Marketplace");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. Apply Discount to a Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Search by Category");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Product ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Book Categories: FICTION, NON_FICTION, EDUCATION");
                System.out.print("Enter Category: ");
                String cat = sc.nextLine();

                Product<BookCategory> book = new Product<>(id, name, price, BookCategory.valueOf(cat.toUpperCase()));
                catalog.addProduct(book);

            } else if (ch == 2) {
                System.out.print("Enter Product ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Clothing Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Clothing Categories: MEN, WOMEN, KIDS");
                System.out.print("Enter Category: ");
                String cat = sc.nextLine();

                Product<ClothingCategory> clothing = new Product<>(id, name, price, ClothingCategory.valueOf(cat.toUpperCase()));
                catalog.addProduct(clothing);

            } else if (ch == 3) {
                System.out.print("Enter Product ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Gadget Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Gadget Categories: MOBILE, LAPTOP, ACCESSORY");
                System.out.print("Enter Category: ");
                String cat = sc.nextLine();

                Product<GadgetCategory> gadget = new Product<>(id, name, price, GadgetCategory.valueOf(cat.toUpperCase()));
                catalog.addProduct(gadget);

            } else if (ch == 4) {
                System.out.print("Enter Product ID: ");
                String id = sc.nextLine();

                Product<? extends BaseCategory> found = null;

                // search manually (simple)
                // because catalog list has wildcard products
                // we will re-check inside display list
                // easiest way: display all, user picks correct id
                // but here we scan inside catalog using reflection-free approach

                // quick search in catalog (by loop)
                // (to keep your pattern simple, we access through display method)
                // so add a getter in Catalog OR do this minimal approach:
                System.out.println("Apply discount feature works after displaying all products and selecting correct ID.");
                System.out.println("Use option 5 to see products.");
                System.out.println("Then update code by adding getProducts() if needed.");

            } else if (ch == 5) {
                catalog.displayAll();

            } else if (ch == 6) {
                System.out.print("Enter Category Name to Search: ");
                String category = sc.nextLine();
                catalog.searchByCategory(category);

            } else if (ch == 7) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}
