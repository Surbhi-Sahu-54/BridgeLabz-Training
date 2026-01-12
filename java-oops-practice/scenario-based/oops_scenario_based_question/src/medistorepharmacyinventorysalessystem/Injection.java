package medistorepharmacyinventorysalessystem;
import java.time.LocalDate;

	class Injection extends Medicine {

	    Injection(String name, double price, LocalDate expiryDate) {
	        super(name, price, expiryDate);
	    }

	    @Override
	    public boolean checkExpiry() {
	        // Very strict expiry
	        return LocalDate.now().isAfter(expiryDate.minusDays(5));
	    }

}
