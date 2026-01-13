package traincompanion;
import java.util.ArrayList;
import java.util.List;

public class Compartment {

	    String name;                     // Example: C1, C2, Pantry, WiFi Coach
	    List<String> services;           // Example: ["Pantry", "WiFi"]
	    Compartment prev;
	    Compartment next;

	    public Compartment(String name) {
	        this.name = name;
	        this.services = new ArrayList<>();
	        this.prev = null;
	        this.next = null;
	    }

	    public void addService(String service) {
	        services.add(service);
	    }

	    public boolean hasService(String service) {
	        return services.contains(service);
	    }

	    @Override
	    public String toString() {
	        return name + " " + services;
	    }
}
