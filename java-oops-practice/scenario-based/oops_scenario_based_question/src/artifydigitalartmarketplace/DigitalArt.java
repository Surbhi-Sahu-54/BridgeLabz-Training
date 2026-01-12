package artifydigitalartmarketplace;

	class DigitalArt extends Artwork {

	    public DigitalArt(String title, String artist, double price, String licenseType, boolean preview) {
	        super(title, artist, price, licenseType, preview);
	        this.licenseTerms = "Digital use only – no redistribution";
	    }

	    public void license() {
	        System.out.println("Digital Art License: " + licenseTerms);
	    }
}
