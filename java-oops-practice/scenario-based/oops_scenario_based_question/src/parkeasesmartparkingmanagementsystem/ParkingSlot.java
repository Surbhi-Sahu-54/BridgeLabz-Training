package parkeasesmartparkingmanagementsystem;

public class ParkingSlot {
	    private int slotId;
	    private boolean isOccupied;
	    private String vehicleTypeAllowed;
	    private String location;

	    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
	        this.slotId = slotId;
	        this.location = location;
	        this.vehicleTypeAllowed = vehicleTypeAllowed;
	        this.isOccupied = false;
	    }

	    public boolean isAvailable() {
	        return !isOccupied;
	    }

	    public void bookSlot() {
	        if (!isOccupied) {
	            isOccupied = true;
	        }
	    }

	    public void releaseSlot() {
	        isOccupied = false;
	    }

	    public String getSlotInfo() {
	        return "Slot ID: " + slotId +
	               ", Location: " + location +
	               ", Allowed Vehicle: " + vehicleTypeAllowed +
	               ", Available: " + !isOccupied;
	    }
}
