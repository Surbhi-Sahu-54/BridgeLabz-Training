package foodlooprestaurantorderingsystem;

public class Main {
    public static void main(String[] args) {

	        FoodItem pizza = new VegItem("Paneer Pizza", 350, 5);
	        FoodItem burger = new NonVegItem("Chicken Burger", 250, 5);
	        FoodItem fries = new VegItem("French Fries", 150, 5);

	        // Combo Order
	        Order order = new Order(pizza, burger, fries);

	        order.placeOrder();
	    }
}
