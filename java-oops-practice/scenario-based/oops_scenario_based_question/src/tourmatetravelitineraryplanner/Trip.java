package tourmatetravelitineraryplanner;

	class Trip implements IBookable {
	    String destination;
	    int duration;
	    double budget;

	    Transport transport;
	    Hotel hotel;
	    Activity activity;

	    // Constructor to generate complete trip package
	    public Trip(String destination, int duration,
	                Transport transport, Hotel hotel, Activity activity) {

	        this.destination = destination;
	        this.duration = duration;
	        this.transport = transport;
	        this.hotel = hotel;
	        this.activity = activity;

	        // Operator usage
	        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
	    }

	    public double getTotalBudget() {
	        return budget;
	    }

	    @Override
	    public void book() {
	        System.out.println("Trip booked successfully.");
	    }

	    @Override
	    public void cancel() {
	        System.out.println("Trip cancelled.");
	    }
}
