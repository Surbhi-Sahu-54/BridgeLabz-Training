package bookbazaardigitalbookstoresystem;

public class Book {

	    // instance variables (data members)
	    protected String title;
	    protected String author;
	    protected double price;

	    private int stock;

	    // constructor without discount
	    public Book(String title, String author, double price, int stock) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.stock = stock;
	    }
	    public int getStock() {
	        return stock;
	    }
	    
	    public void reduceStock(int quantity) {
	        if (quantity <= stock) {
	            stock = stock - quantity;
	        } else {
	            System.out.println("Not enough stock available");
	        }
	    }

	    // method to display book details
	    public void displayBook() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Price  : " + price);
	        System.out.println("Stock  : " + stock);
	    }
}
