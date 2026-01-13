package trafficmanager;

public class WaitingQueue {
	    private String[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public WaitingQueue(int capacity) {
	        this.capacity = capacity;
	        this.queue = new String[capacity];
	        this.front = 0;
	        this.rear = -1;
	        this.size = 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public void enqueue(String vehicleNumber) {
	        if (isFull()) {
	            System.out.println("Queue Overflow: Waiting queue is full. Vehicle cannot enter now.");
	            return;
	        }

	        rear = (rear + 1) % capacity;
	        queue[rear] = vehicleNumber;
	        size++;

	        System.out.println("Vehicle added to waiting queue: " + vehicleNumber);
	    }

	    public String dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue Underflow: No vehicle waiting in queue.");
	            return null;
	        }

	        String vehicle = queue[front];
	        front = (front + 1) % capacity;
	        size--;

	        return vehicle;
	    }

	    public void printQueue() {
	        if (isEmpty()) {
	            System.out.println("Waiting queue is empty.");
	            return;
	        }

	        System.out.println("\nVehicles in waiting queue:");
	        int index = front;
	        for (int i = 0; i < size; i++) {
	            System.out.println("- " + queue[index]);
	            index = (index + 1) % capacity;
	        }
	    }

	    public int getSize() {
	        return size;
	    }
}
