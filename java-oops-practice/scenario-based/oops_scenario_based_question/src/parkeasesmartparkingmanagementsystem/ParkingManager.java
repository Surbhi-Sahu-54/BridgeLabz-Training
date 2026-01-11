package parkeasesmartparkingmanagementsystem;

public class ParkingManager {
	    private String bookingLog = "";

	    public void logBooking(String message) {
	        bookingLog += message + "\n";
	    }

	    public void showLogs() {
	        System.out.println("---- Parking Logs ----");
	        System.out.println(bookingLog);
	    }
}
