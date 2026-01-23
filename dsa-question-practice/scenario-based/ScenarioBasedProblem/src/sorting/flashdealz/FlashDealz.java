/*
FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */

package sorting.flashdealz;
import java.util.*;

class Product {
    String name;
    double discount;

    Product(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }
}

public class FlashDealz {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(String name, double discount) {
        products.add(new Product(name, discount));
        System.out.println("Product added.");
    }

    void sortByDiscount() {
        if (products.size() <= 1) {
            System.out.println("Not enough products to sort.");
            return;
        }
        quickSort(0, products.size() - 1);
        System.out.println("Products sorted by discount using Quick Sort.");
    }

    void quickSort(int low, int high) {
        if (low < high) {
            int p = partition(low, high);
            quickSort(low, p - 1);
            quickSort(p + 1, high);
        }
    }

    int partition(int low, int high) {
        double pivot = products.get(high).discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (products.get(j).discount > pivot) {
                i++;
                Product temp = products.get(i);
                products.set(i, products.get(j));
                products.set(j, temp);
            }
        }

        Product temp = products.get(i + 1);
        products.set(i + 1, products.get(high));
        products.set(high, temp);

        return i + 1;
    }

    void displayProducts() {
        if (products.size() == 0) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Products (High to Low Discount):");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println((i + 1) + ". " + p.name + " - " + p.discount + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlashDealz fd = new FlashDealz();

        while (true) {
            System.out.println("\n1. Add Product Discount");
            System.out.println("2. Sort Products (Quick Sort)");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Discount (%): ");
                double discount = sc.nextDouble();

                fd.addProduct(name, discount);

            } else if (ch == 2) {
                fd.sortByDiscount();

            } else if (ch == 3) {
                fd.displayProducts();

            } else if (ch == 4) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
