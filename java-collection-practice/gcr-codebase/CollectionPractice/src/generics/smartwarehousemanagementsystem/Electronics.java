package generics.smartwarehousemanagementsystem;
public class Electronics extends WarehouseItem {
    private int warrantyMonths;

    public Electronics(String itemId, String itemName, int warrantyMonths) {
        super(itemId, itemName);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics -> ID: " + getItemId() + ", Name: " + getItemName() + ", Warranty: " + warrantyMonths + " months");
    }
}
