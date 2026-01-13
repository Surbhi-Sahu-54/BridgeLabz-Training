package ambulanceroute;

public class CircularHospitalRoute {
	    private HospitalUnit head = null;
	    private HospitalUnit tail = null;

	    // Add Unit
	    public void addUnit(String name) {
	        HospitalUnit newUnit = new HospitalUnit(name);

	        if (head == null) {
	            head = newUnit;
	            tail = newUnit;
	            tail.next = head; // circular link
	        } else {
	            tail.next = newUnit;
	            tail = newUnit;
	            tail.next = head; // circular link
	        }

	        System.out.println(" Unit added: " + name);
	    }

	    // Display All Units
	    public void displayUnits() {
	        if (head == null) {
	            System.out.println("No units available!");
	            return;
	        }

	        HospitalUnit temp = head;
	        System.out.println("\n Hospital Units (Circular Route):");
	        do {
	            System.out.println( temp.name + " | Available: " + temp.available);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // Mark Unit Available / Unavailable
	    public void setAvailability(String name, boolean status) {
	        if (head == null) {
	            System.out.println(" No units exist!");
	            return;
	        }

	        HospitalUnit temp = head;
	        do {
	            if (temp.name.equalsIgnoreCase(name)) {
	                temp.available = status;
	                System.out.println( temp.name + " availability updated to: " + status);
	                return;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println(" Unit not found!");
	    }

	    // Remove Unit (Maintenance)
	    public void removeUnit(String name) {
	        if (head == null) {
	            System.out.println(" No units to remove!");
	            return;
	        }

	        HospitalUnit current = head;
	        HospitalUnit previous = tail;

	        do {
	            if (current.name.equalsIgnoreCase(name)) {

	                // only 1 node case
	                if (head == tail) {
	                    head = null;
	                    tail = null;
	                    System.out.println(" Unit removed (only unit): " + name);
	                    return;
	                }

	                // remove head
	                if (current == head) {
	                    head = head.next;
	                    tail.next = head;
	                }
	                // remove tail
	                else if (current == tail) {
	                    tail = previous;
	                    tail.next = head;
	                }
	                // remove middle
	                else {
	                    previous.next = current.next;
	                }

	                System.out.println(" Unit removed (Maintenance): " + name);
	                return;
	            }

	            previous = current;
	            current = current.next;

	        } while (current != head);

	        System.out.println(" Unit not found!");
	    }

	    // ✅ Find Nearest Available Unit for Patient
	    public void redirectPatient(String patientName, String startUnitName) {
	        if (head == null) {
	            System.out.println(" No units available! Patient cannot be redirected.");
	            return;
	        }

	        // Find start unit
	        HospitalUnit start = head;
	        boolean found = false;

	        do {
	            if (start.name.equalsIgnoreCase(startUnitName)) {
	                found = true;
	                break;
	            }
	            start = start.next;
	        } while (start != head);

	        if (!found) {
	            System.out.println(" Starting Unit not found!");
	            return;
	        }

	        System.out.println("\n Ambulance bringing patient: " + patientName);
	        System.out.println("Starting from: " + start.name);

	        HospitalUnit temp = start;

	        // Rotate until available found
	        do {
	            System.out.println(" Checking Unit: " + temp.name);

	            if (temp.available) {
	                System.out.println(" Patient " + patientName + " redirected to: " + temp.name);
	                return;
	            }

	            temp = temp.next;

	        } while (temp != start);

	        System.out.println(" All units are FULL / Unavailable. Patient must wait!");
	    }
}
