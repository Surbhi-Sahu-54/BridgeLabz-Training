package medistorepharmacyinventorysalessystem;
import java.time.LocalDate;

	class Syrup extends Medicine {

	    Syrup(String name, double price, LocalDate expiryDate) {
	        super(name, price, expiryDate);
	    }

	    @Override
	    public boolean checkExpiry() {
	        // Syrups expire faster
	        return LocalDate.now().isAfter(expiryDate);
	    }

}
