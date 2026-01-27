package generics.smartwarehousemanagementsystem;
import java.util.*;

public class Storage<T extends WarehouseItem> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        for (T x : items) {
            if (x.getItemId().equalsIgnoreCase(item.getItemId())) {
                System.out.println("Item ID already exists.");
                return;
            }
        }
        items.add(item);
        System.out.println("Item added.");
    }

    public void removeItem(String itemId) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId().equalsIgnoreCase(itemId)) {
                items.remove(i);
                System.out.println("Item removed.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public T searchItem(String itemId) {
        for (T x : items) {
            if (x.getItemId().equalsIgnoreCase(itemId)) {
                return x;
            }
        }
        return null;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public static void displayAll(Storage<? extends WarehouseItem> storage) {
        ArrayList<? extends WarehouseItem> list = storage.getItems();

        if (list.size() == 0) {
            System.out.println("No items available.");
            return;
        }

        for (WarehouseItem w : list) {
            w.displayDetails();
        }
    }
}
