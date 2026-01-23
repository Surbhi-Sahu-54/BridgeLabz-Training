/*
IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons
 */

package sorting.flavorsbypopularity;
import java.util.*;

class Flavor {
    String name;
    int soldCount;

    Flavor(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }
}

public class IceCreamRush {
    ArrayList<Flavor> flavors = new ArrayList<>();

    void addFlavor(String name, int soldCount) {
        flavors.add(new Flavor(name, soldCount));
        System.out.println("Flavor added.");
    }

    void bubbleSortByPopularity() {
        if (flavors.size() <= 1) {
            System.out.println("Not enough flavors to sort.");
            return;
        }

        for (int i = 0; i < flavors.size() - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < flavors.size() - 1 - i; j++) {
                if (flavors.get(j).soldCount < flavors.get(j + 1).soldCount) {
                    Flavor temp = flavors.get(j);
                    flavors.set(j, flavors.get(j + 1));
                    flavors.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Flavors sorted by popularity using Bubble Sort.");
    }

    void displayFlavors() {
        if (flavors.size() == 0) {
            System.out.println("No flavors available.");
            return;
        }

        System.out.println("Flavors List (High to Low Sales):");
        for (int i = 0; i < flavors.size(); i++) {
            Flavor f = flavors.get(i);
            System.out.println((i + 1) + ". " + f.name + " - " + f.soldCount);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCreamRush ic = new IceCreamRush();

        while (true) {
            System.out.println("\n1. Add Flavor Sales");
            System.out.println("2. Sort Flavors (Bubble Sort)");
            System.out.println("3. Display Flavors");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Flavor Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Sold Count: ");
                int sold = sc.nextInt();

                ic.addFlavor(name, sold);

            } else if (ch == 2) {
                ic.bubbleSortByPopularity();

            } else if (ch == 3) {
                ic.displayFlavors();

            } else if (ch == 4) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
