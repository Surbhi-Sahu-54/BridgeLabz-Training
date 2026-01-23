package generics.dynamiconlinemarketplace;
public class Product<T extends BaseCategory> {
    private String productId;
    private String productName;
    private double price;
    private T category;

    public Product(String productId, String productName, double price, T category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Price: " + price + ", Category: " + category.getCategoryName());
    }
}
