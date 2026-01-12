package foodlooprestaurantorderingsystem;

	class NonVegItem extends FoodItem {

	    public NonVegItem(String name, double price, int availability) {
	        super(name, "Non-Veg", price, availability);
	    }

	    @Override
	    public void displayItem() {
	        System.out.println("Non-Veg Item: " + getName() + " | Price: " + getPrice());
	    }
}
