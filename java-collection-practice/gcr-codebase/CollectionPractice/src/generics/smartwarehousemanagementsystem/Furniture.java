package generics.smartwarehousemanagementsystem;
public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String itemId, String itemName, String material) {
        super(itemId, itemName);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture -> ID: " + getItemId() + ", Name: " + getItemName() + ", Material: " + material);
    }
}
