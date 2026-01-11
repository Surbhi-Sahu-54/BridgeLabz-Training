package parkeasesmartparkingmanagementsystem;

public class Main {
	
	    public static void main(String[] args) {

	        ParkingSlot slot1 = new ParkingSlot(101, "Ground Floor", "Car");
	        Vehicle car = new Car("MP09-AB-1234");

	        ParkingManager manager = new ParkingManager();

	        if (slot1.isAvailable()) {
	            slot1.bookSlot();
	            manager.logBooking("Car parked in Slot 101");
	        }

	        int hours = 6;
	        double charges = car.calculateCharges(hours);

	        manager.logBooking("Parking Duration: " + hours + " hours");
	        manager.logBooking("Total Charges: ₹" + charges);

	        slot1.releaseSlot();
	        manager.logBooking("Slot 101 released");

	        System.out.println(slot1.getSlotInfo());
	        manager.showLogs();
	    }

}
