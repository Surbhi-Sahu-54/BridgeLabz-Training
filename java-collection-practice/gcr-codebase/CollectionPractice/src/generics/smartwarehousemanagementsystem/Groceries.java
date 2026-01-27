package generics.smartwarehousemanagementsystem;
public class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String itemId, String itemName, String expiryDate) {
        super(itemId, itemName);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries -> ID: " + getItemId() + ", Name: " + getItemName() + ", Expiry: " + expiryDate);
    }
}
