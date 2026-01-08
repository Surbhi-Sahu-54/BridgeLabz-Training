package bookbazaardigitalbookstoresystem;

	public class EBook extends Book implements IDiscountable {

	    // constructor
	    public EBook(String title, String author, double price, int stock) {
	        super(title, author, price, stock);
	    }

	    // discount logic for EBook
	    public double applyDiscount(double price) {
	        // 20% discount
	        return price * 0.80;
	    }
	}
