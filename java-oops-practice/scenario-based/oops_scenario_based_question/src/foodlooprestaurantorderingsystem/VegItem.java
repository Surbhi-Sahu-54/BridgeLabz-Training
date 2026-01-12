package foodlooprestaurantorderingsystem;

	class VegItem extends FoodItem {

	    public VegItem(String name, double price, int availability) {
	        super(name, "Veg", price, availability);
	    }

	    @Override
	    public void displayItem() {
	        System.out.println("Veg Item: " + getName() + " | Price: " + getPrice());
	    }
}
