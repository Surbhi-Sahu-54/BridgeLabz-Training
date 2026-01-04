package com.linkedlist.singlylinkedlist.inventorymanagementSystem;

public class InventoryLinkedList {
	    private ItemNode head;

	    /* ---------------- ADD OPERATIONS ---------------- */

	    // Add at beginning O(1)
	    public void addAtBeginning(int id, String name, int qty, double price) {
	        ItemNode newNode = new ItemNode(id, name, qty, price);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Add at end O(n)
	    public void addAtEnd(int id, String name, int qty, double price) {
	        ItemNode newNode = new ItemNode(id, name, qty, price);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        ItemNode temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Add at specific position (1-based)
	    public void addAtPosition(int pos, int id, String name, int qty, double price) {
	        if (pos <= 0) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (pos == 1) {
	            addAtBeginning(id, name, qty, price);
	            return;
	        }

	        ItemNode temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range");
	            return;
	        }

	        ItemNode newNode = new ItemNode(id, name, qty, price);
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    /* ---------------- DELETE ---------------- */

	    public void removeByItemId(int id) {
	        if (head == null) {
	            System.out.println("Inventory is empty");
	            return;
	        }

	        if (head.itemId == id) {
	            head = head.next;
	            return;
	        }

	        ItemNode temp = head;
	        while (temp.next != null && temp.next.itemId != id) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Item not found");
	            return;
	        }

	        temp.next = temp.next.next;
	    }

	    /* ---------------- UPDATE ---------------- */

	    public void updateQuantity(int id, int newQty) {
	        ItemNode temp = head;

	        while (temp != null) {
	            if (temp.itemId == id) {
	                temp.quantity = newQty;
	                System.out.println("Quantity updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    /* ---------------- SEARCH ---------------- */

	    public void searchById(int id) {
	        ItemNode temp = head;
	        while (temp != null) {
	            if (temp.itemId == id) {
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    public void searchByName(String name) {
	        ItemNode temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Item not found");
	        }
	    }

	    /* ---------------- DISPLAY ---------------- */

	    public void displayAll() {
	        if (head == null) {
	            System.out.println("No items in inventory");
	            return;
	        }

	        ItemNode temp = head;
	        while (temp != null) {
	            displayItem(temp);
	            temp = temp.next;
	        }
	    }

	    private void displayItem(ItemNode i) {
	        System.out.println(
	            "ID: " + i.itemId +
	            ", Name: " + i.itemName +
	            ", Qty: " + i.quantity +
	            ", Price: " + i.price
	        );
	    }

	    /* ---------------- TOTAL VALUE ---------------- */

	    public void calculateTotalValue() {
	        double total = 0;
	        ItemNode temp = head;

	        while (temp != null) {
	            total += temp.quantity * temp.price;
	            temp = temp.next;
	        }

	        System.out.println("Total Inventory Value: " + total);
	    }

	    /* ---------------- SORTING (MERGE SORT) ---------------- */

	    public void sortByName(boolean ascending) {
	        head = mergeSort(head, ascending, true);
	    }

	    public void sortByPrice(boolean ascending) {
	        head = mergeSort(head, ascending, false);
	    }

	    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {
	        if (h == null || h.next == null)
	            return h;

	        ItemNode middle = getMiddle(h);
	        ItemNode nextOfMiddle = middle.next;
	        middle.next = null;

	        ItemNode left = mergeSort(h, asc, byName);
	        ItemNode right = mergeSort(nextOfMiddle, asc, byName);

	        return sortedMerge(left, right, asc, byName);
	    }

	    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
	        if (a == null) return b;
	        if (b == null) return a;

	        boolean condition;
	        if (byName) {
	            condition = asc
	                ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
	                : a.itemName.compareToIgnoreCase(b.itemName) > 0;
	        } else {
	            condition = asc ? a.price <= b.price : a.price > b.price;
	        }

	        ItemNode result;
	        if (condition) {
	            result = a;
	            result.next = sortedMerge(a.next, b, asc, byName);
	        } else {
	            result = b;
	            result.next = sortedMerge(a, b.next, asc, byName);
	        }
	        return result;
	    }

	    private ItemNode getMiddle(ItemNode h) {
	        ItemNode slow = h, fast = h.next;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
}
