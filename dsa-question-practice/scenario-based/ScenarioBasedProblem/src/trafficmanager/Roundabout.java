package trafficmanager;

public class Roundabout {
	    private VehicleNode tail;  // tail.next will always point to head

	    public Roundabout() {
	        this.tail = null;
	    }

	    // Check if roundabout is empty
	    public boolean isEmpty() {
	        return tail == null;
	    }

	    // Add vehicle in roundabout
	    public void addVehicle(String vehicleNumber) {
	        VehicleNode newNode = new VehicleNode(vehicleNumber);

	        if (isEmpty()) {
	            tail = newNode;
	            tail.next = tail;  // circular link to itself
	        } else {
	            newNode.next = tail.next;  // newNode points to head
	            tail.next = newNode;       // tail points to new head
	            tail = newNode;            // update tail
	        }

	        System.out.println("Vehicle added to roundabout: " + vehicleNumber);
	    }

	    // Remove vehicle by vehicle number
	    public void removeVehicle(String vehicleNumber) {
	        if (isEmpty()) {
	            System.out.println("Roundabout is empty. No vehicle to remove.");
	            return;
	        }

	        VehicleNode current = tail.next; // head
	        VehicleNode previous = tail;

	        do {
	            if (current.vehicleNumber.equalsIgnoreCase(vehicleNumber)) {

	                // Case 1: only one vehicle
	                if (current == tail && current.next == tail) {
	                    tail = null;
	                }
	                // Case 2: removing tail
	                else if (current == tail) {
	                    previous.next = current.next;
	                    tail = previous;
	                }
	                // Case 3: removing head or middle
	                else {
	                    previous.next = current.next;
	                }

	                System.out.println("Vehicle removed from roundabout: " + vehicleNumber);
	                return;
	            }

	            previous = current;
	            current = current.next;

	        } while (current != tail.next);

	        System.out.println("Vehicle not found in roundabout: " + vehicleNumber);
	    }

	    // Print roundabout vehicles
	    public void printRoundabout() {
	        if (isEmpty()) {
	            System.out.println("Roundabout is empty.");
	            return;
	        }

	        System.out.println("\nVehicles currently in roundabout:");
	        VehicleNode head = tail.next;
	        VehicleNode temp = head;

	        do {
	            System.out.println("- " + temp.vehicleNumber);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // Count vehicles inside roundabout
	    public int countVehicles() {
	        if (isEmpty()) return 0;

	        int count = 0;
	        VehicleNode head = tail.next;
	        VehicleNode temp = head;

	        do {
	            count++;
	            temp = temp.next;
	        } while (temp != head);

	        return count;
	    }
}
