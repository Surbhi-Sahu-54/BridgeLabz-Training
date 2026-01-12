package foodlooprestaurantorderingsystem;

	abstract class FoodItem {
	    private String name;
	    private String category;
	    private double price;
	    private int availability;   // stock hidden (encapsulation)

	    public FoodItem(String name, String category, double price, int availability) {
	        this.name = name;
	        this.category = category;
	        this.price = price;
	        this.availability = availability;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public boolean isAvailable() {
	        return availability > 0;
	    }

	    protected void reduceStock() {
	        if (availability > 0) {
	            availability--;
	        }
	    }

	    public abstract void displayItem(); // polymorphic behavior
}
