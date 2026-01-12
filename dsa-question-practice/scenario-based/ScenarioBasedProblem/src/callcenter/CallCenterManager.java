package callcenter;
import java.util.*;

	public class CallCenterManager {

	    // Normal call queue
	    Queue<Customer> normalQueue = new LinkedList<>();

	    // VIP priority queue (VIPs first)
	    PriorityQueue<Customer> vipQueue =
	            new PriorityQueue<>((a, b) -> Boolean.compare(b.isVIP, a.isVIP));

	    // Call count tracker
	    HashMap<Customer, Integer> callCountMap = new HashMap<>();

	    // Add incoming call
	    public void addCall(Customer customer) {

	        // Track call count
	        callCountMap.put(customer,
	                callCountMap.getOrDefault(customer, 0) + 1);

	        // Add to respective queue
	        if (customer.isVIP) {
	            vipQueue.offer(customer);
	        } else {
	            normalQueue.offer(customer);
	        }

	        System.out.println("Incoming call from: " + customer);
	    }

	    // Process next call
	    public void handleCall() {

	        Customer customer;

	        if (!vipQueue.isEmpty()) {
	            customer = vipQueue.poll();
	        } else if (!normalQueue.isEmpty()) {
	            customer = normalQueue.poll();
	        } else {
	            System.out.println("No calls to handle.");
	            return;
	        }

	        System.out.println("Handling call of: " + customer);
	    }

	    // Display call statistics
	    public void showCallStats() {
	        System.out.println("\n Call Frequency This Month:");
	        for (Map.Entry<Customer, Integer> entry : callCountMap.entrySet()) {
	            System.out.println(entry.getKey().name + " → " + entry.getValue() + " calls");
	        }
	    }
}
