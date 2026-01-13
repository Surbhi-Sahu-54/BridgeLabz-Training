package traincompanion;

public class Main {
	    public static void main(String[] args) {

	        TrainDoublyLinkedList train = new TrainDoublyLinkedList();

	        // Insert compartments
	        train.addCompartment("C1");
	        train.addCompartment("C2");
	        train.addCompartment("Pantry");
	        train.addCompartment("C3");
	        train.addCompartment("WiFi-Coach");

	        // Add services
	        train.addServiceToCompartment("Pantry", "Food");
	        train.addServiceToCompartment("WiFi-Coach", "WiFi");
	        train.addServiceToCompartment("C2", "Charging");

	        // Traverse
	        train.traverseForward();
	        train.traverseBackward();

	        // Adjacent compartments
	        train.showAdjacent("Pantry");

	        //  Search service
	        train.searchService("WiFi");
	        train.searchService("Food");

	        //  Remove a compartment dynamically
	        train.removeCompartment("C2");

	        // Traverse again
	        train.traverseForward();

	        // Adjacent after removal
	        train.showAdjacent("C1");
	    }
}
