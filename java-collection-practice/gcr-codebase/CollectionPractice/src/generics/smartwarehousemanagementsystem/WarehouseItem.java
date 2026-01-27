package generics.smartwarehousemanagementsystem;
public abstract class WarehouseItem {
    private String itemId;
    private String itemName;

    public WarehouseItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public abstract void displayDetails();
}
