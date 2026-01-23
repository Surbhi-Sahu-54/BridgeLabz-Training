package generics.dynamiconlinemarketplace;

import java.util.*;

public class Catalog {
    private ArrayList<Product<? extends BaseCategory>> products = new ArrayList<>();

    public void addProduct(Product<? extends BaseCategory> p) {
        for (Product<? extends BaseCategory> x : products) {
            if (x.getProductId().equalsIgnoreCase(p.getProductId())) {
                System.out.println("Product ID already exists.");
                return;
            }
        }
        products.add(p);
        System.out.println("Product added to catalog.");
    }

    public void displayAll() {
        if (products.size() == 0) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Marketplace Product Catalog:");
        for (Product<? extends BaseCategory> p : products) {
            p.displayProduct();
        }
    }

    public void searchByCategory(String categoryName) {
        boolean found = false;

        for (Product<? extends BaseCategory> p : products) {
            if (p.getCategory().getCategoryName().equalsIgnoreCase(categoryName)) {
                p.displayProduct();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found in this category.");
        }
    }
}

