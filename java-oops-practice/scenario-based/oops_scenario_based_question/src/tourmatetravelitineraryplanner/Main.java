package tourmatetravelitineraryplanner;

public class Main {
	    public static void main(String[] args) {

	        Transport t1 = new Transport(15000);
	        Hotel h1 = new Hotel(25000);
	        Activity a1 = new Activity(10000);

	        Trip internationalTrip = new InternationalTrip(
	                "Paris", 7, t1, h1, a1);

	        System.out.println("Total Budget: " + internationalTrip.getTotalBudget());
	        internationalTrip.book();

	        System.out.println("--------------------------------");

	        Transport t2 = new Transport(5000);
	        Hotel h2 = new Hotel(8000);
	        Activity a2 = new Activity(3000);

	        Trip domesticTrip = new DomesticTrip(
	                "Goa", 5, t2, h2, a2);

	        System.out.println("Total Budget: " + domesticTrip.getTotalBudget());
	        domesticTrip.book();
	    }

}
