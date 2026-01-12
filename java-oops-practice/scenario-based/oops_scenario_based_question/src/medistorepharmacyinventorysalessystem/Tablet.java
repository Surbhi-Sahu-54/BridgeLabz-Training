package medistorepharmacyinventorysalessystem;
import java.time.LocalDate;

	class Tablet extends Medicine {

	    Tablet(String name, double price, LocalDate expiryDate) {
	        super(name, price, expiryDate);
	    }

	    // Polymorphism
	    @Override
	    public boolean checkExpiry() {
	        // Tablets last slightly longer
	        return LocalDate.now().isAfter(expiryDate.plusMonths(3));
	    }
}
