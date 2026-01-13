package ambulanceroute;

public class HospitalUnit {
	    String name;
	    boolean available;
	    HospitalUnit next;

	    public HospitalUnit(String name) {
	        this.name = name;
	        this.available = true; // by default available
	        this.next = null;
	    }
}
