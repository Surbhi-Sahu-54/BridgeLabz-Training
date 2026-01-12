package medistorepharmacyinventorysalessystem;
import java.time.LocalDate;

public class Main {
	    public static void main(String[] args) {

	        Medicine m1 = new Tablet("Paracetamol", 5, LocalDate.of(2026, 6, 1));
	        Medicine m2 = new Syrup("Cough Syrup", 120, LocalDate.of(2025, 2, 1));
	        Medicine m3 = new Injection("Insulin", 500, LocalDate.of(2025, 1, 20));

	        System.out.println("Bill: " + m1.sell(12));
	        System.out.println("Tablet expired? " + m1.checkExpiry());

	        System.out.println("Syrup expired? " + m2.checkExpiry());
	        System.out.println("Injection expired? " + m3.checkExpiry());
	    }
}
