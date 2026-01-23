package generics.dynamiconlinemarketplace;
public class DiscountUtil {
    public static <T extends Product<? extends BaseCategory>> void applyDiscount(T product, double percentage) {
        double oldPrice = product.getPrice();
        double newPrice = oldPrice - (oldPrice * percentage / 100);

        product.setPrice(newPrice);
        System.out.println("Discount Applied: " + percentage + "%");
        System.out.println("Old Price: " + oldPrice + ", New Price: " + newPrice);
    }
}
