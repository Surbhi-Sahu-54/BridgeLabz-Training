package browserbuddytabhistorymanager;

public class BrowserTab {
	    private PageNode current;

	    // Visit new page
	    void visit(String url) {
	        PageNode newPage = new PageNode(url);

	        if (current != null) {
	            current.next = null; // clear forward history
	            newPage.prev = current;
	            current.next = newPage;
	        }
	        current = newPage;
	        System.out.println("Visited: " + url);
	    }

	    // Go back
	    void back() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Back to: " + current.url);
	        } else {
	            System.out.println("No previous page!");
	        }
	    }

	    // Go forward
	    void forward() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Forward to: " + current.url);
	        } else {
	            System.out.println("No forward page!");
	        }
	    }

	    String getCurrentPage() {
	        return current != null ? current.url : "Empty Tab";
	    }
}
