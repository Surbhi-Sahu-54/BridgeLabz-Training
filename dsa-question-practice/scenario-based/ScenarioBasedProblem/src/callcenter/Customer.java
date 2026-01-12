package callcenter;

public class Customer {
	    int id;
	    String name;
	    boolean isVIP;

	    public Customer(int id, String name, boolean isVIP) {
	        this.id = id;
	        this.name = name;
	        this.isVIP = isVIP;
	    }

	    @Override
	    public String toString() {
	        return name + (isVIP ? " (VIP)" : "");
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Customer)) return false;
	        Customer c = (Customer) obj;
	        return this.id == c.id;
	    }
}
