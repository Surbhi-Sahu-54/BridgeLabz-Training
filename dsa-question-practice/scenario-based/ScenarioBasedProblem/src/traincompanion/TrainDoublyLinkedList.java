package traincompanion;

public class TrainDoublyLinkedList {
	    private Compartment head;
	    private Compartment tail;

	    public TrainDoublyLinkedList() {
	        head = null;
	        tail = null;
	    }

	    // Insert at end
	    public void addCompartment(String name) {
	        Compartment newCompartment = new Compartment(name);

	        if (head == null) {
	            head = tail = newCompartment;
	        } else {
	            tail.next = newCompartment;
	            newCompartment.prev = tail;
	            tail = newCompartment;
	        }
	        System.out.println("Added: " + name);
	    }

	    // Add service to a compartment
	    public void addServiceToCompartment(String name, String service) {
	        Compartment temp = head;
	        while (temp != null) {
	            if (temp.name.equalsIgnoreCase(name)) {
	                temp.addService(service);
	                System.out.println(" Added service " + service + " in " + name);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Compartment not found!");
	    }

	    //  Forward traverse
	    public void traverseForward() {
	        if (head == null) {
	            System.out.println("Train is empty!");
	            return;
	        }

	        System.out.println("\nForward Traversal:");
	        Compartment temp = head;
	        while (temp != null) {
	            System.out.print(temp.name + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("NULL");
	    }

	    // Backward traverse
	    public void traverseBackward() {
	        if (tail == null) {
	            System.out.println(" Train is empty!");
	            return;
	        }

	        System.out.println("\n Backward Traversal:");
	        Compartment temp = tail;
	        while (temp != null) {
	            System.out.print(temp.name + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("NULL");
	    }

	    // Remove compartment by name
	    public void removeCompartment(String name) {
	        if (head == null) {
	            System.out.println("Train is empty!");
	            return;
	        }

	        Compartment temp = head;
	        while (temp != null) {

	            if (temp.name.equalsIgnoreCase(name)) {

	                // If node is head
	                if (temp == head) {
	                    head = head.next;
	                    if (head != null) head.prev = null;
	                }
	                // If node is tail
	                else if (temp == tail) {
	                    tail = tail.prev;
	                    if (tail != null) tail.next = null;
	                }
	                // Middle node
	                else {
	                    temp.prev.next = temp.next;
	                    temp.next.prev = temp.prev;
	                }

	                System.out.println(" Removed: " + name);
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Compartment not found to remove!");
	    }

	    // Display Adjacent Compartments
	    public void showAdjacent(String currentName) {
	        Compartment temp = head;

	        while (temp != null) {
	            if (temp.name.equalsIgnoreCase(currentName)) {
	                System.out.println("\n📍 Current Compartment: " + temp.name);

	                if (temp.prev != null)
	                    System.out.println("⬅️ Previous: " + temp.prev.name);
	                else
	                    System.out.println("⬅️ Previous: NONE (Start)");

	                if (temp.next != null)
	                    System.out.println("➡️ Next: " + temp.next.name);
	                else
	                    System.out.println("➡️ Next: NONE (End)");

	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println(" Compartment not found!");
	    }

	    // ✅ Search service in train
	    public void searchService(String service) {
	        Compartment temp = head;
	        boolean found = false;

	        System.out.println("\n Searching service: " + service);

	        while (temp != null) {
	            if (temp.hasService(service)) {
	                System.out.println("Service '" + service + "' available in: " + temp.name);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Service not found in any compartment!");
	        }
	    }

}
