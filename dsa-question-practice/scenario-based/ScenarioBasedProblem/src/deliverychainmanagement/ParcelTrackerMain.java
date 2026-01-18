package deliverychainmanagement;

public class ParcelTrackerMain {
	public static void main(String[] args) {

			ParcelLinkedList parcelStages = new ParcelLinkedList();

			System.out.println("===================================");
			System.out.println("   WELCOME TO PARCEL TRACKER APP");
			System.out.println("===================================");

			// Default delivery stages
			parcelStages.addAtEnd("Packed");
			parcelStages.addAtEnd("Shipped");
			parcelStages.addAtEnd("In Transit");
			parcelStages.addAtEnd("Delivered");

			// Show current tracking chain
			parcelStages.showStages();

			// Check status
			parcelStages.deliveryStatus();

			// Adding custom checkpoint
			System.out.println("\nAdding a new checkpoint...");
			parcelStages.addCheckpointAfter("Shipped", "Arrived in Country");

			// Show updated stages
			parcelStages.showStages();
	}

}
