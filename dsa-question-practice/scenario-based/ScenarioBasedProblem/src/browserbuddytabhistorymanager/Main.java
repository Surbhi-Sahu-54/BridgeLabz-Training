package browserbuddytabhistorymanager;

public class Main {
	    public static void main(String[] args) {

	        BrowserBuddy browser = new BrowserBuddy();

	        browser.openPage("google.com");
	        browser.openPage("github.com");
	        browser.openPage("stackoverflow.com");

	        browser.back();
	        browser.back();
	        browser.forward();

	        browser.closeTab();

	        browser.restoreTab();
	        browser.back();
	    }
}
