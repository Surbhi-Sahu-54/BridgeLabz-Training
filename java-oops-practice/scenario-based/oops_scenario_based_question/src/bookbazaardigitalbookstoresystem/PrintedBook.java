package bookbazaardigitalbookstoresystem;

	public class PrintedBook extends Book implements IDiscountable {

	    // constructor
	    public PrintedBook(String title, String author, double price, int stock) {
	        super(title, author, price, stock);
	    }

	    // discount logic for PrintedBook
	    @Override
	    public double applyDiscount(double price) {
	        // 10% discount
	        return price * 0.90;
	    }

}
