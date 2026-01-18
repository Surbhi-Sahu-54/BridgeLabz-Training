package deliverychainmanagement;

public class ParcelLinkedList {
			private StageNode head;

		// Add stage at START
		public void addAtStart(String stage) {
			StageNode newNode = new StageNode(stage);
			newNode.next = head;
			head = newNode;
			System.out.println("Stage added at START: " + stage);
		}

		// Add stage at END
		public void addAtEnd(String stage) {
			StageNode newNode = new StageNode(stage);

			if (head == null) {
				head = newNode;
				System.out.println("Stage added as FIRST stage: " + stage);
				return;
			}

			StageNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

		// Add stage AFTER a given stage
		public void addCheckpointAfter(String afterStage, String newStage) {

			if (head == null) {
				System.out.println("Chain is empty! No stages available.");
				return;
			}

			StageNode temp = head;

			while (temp != null && !temp.stageName.equalsIgnoreCase(afterStage)) {
				temp = temp.next;
			}

			if (temp == null) {
				System.out.println("Stage not found: " + afterStage);
				return;
			}

			StageNode newNode = new StageNode(newStage);
			newNode.next = temp.next;
			temp.next = newNode;

			System.out.println("Checkpoint added: " + newStage + " (After: " + afterStage + ")");
		}

		// Delivery Status Check
		public void deliveryStatus() {

			if (head == null) {
				System.out.println("No parcel stages found!");
				return;
			}

			StageNode temp = head;

			while (temp != null) {

				// If delivered found anywhere
				if (temp.stageName.equalsIgnoreCase("Delivered")) {
					System.out.println("Status: Parcel Delivered Successfully!");
					return;
				}

				// If chain breaks before delivered
				if (temp.next == null && !temp.stageName.equalsIgnoreCase("Delivered")) {
					System.out.println("Status: Parcel LOST after stage -> " + temp.stageName);
					return;
				}

				temp = temp.next;
			}
		}

		// Print stages (forward tracking)
		public void showStages() {

			if (head == null) {
				System.out.println("No stages to display!");
				return;
			}

			System.out.println("\n------ Parcel Tracking Stages ------");

			StageNode temp = head;
			while (temp != null) {
				System.out.println(temp.stageName);
				temp = temp.next;
			}

			System.out.println("-----------------------------------");
		}
}
