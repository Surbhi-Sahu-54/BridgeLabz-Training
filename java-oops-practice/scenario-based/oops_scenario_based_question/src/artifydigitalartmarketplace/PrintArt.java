package artifydigitalartmarketplace;

	class PrintArt extends Artwork {

	    public PrintArt(String title, String artist, double price, String licenseType) {
	        super(title, artist, price, licenseType);
	        this.licenseTerms = "Single physical print allowed";
	    }

	    @Override
	    public void license() {
	        System.out.println(" Print Art License: " + licenseTerms);
	    }

}
