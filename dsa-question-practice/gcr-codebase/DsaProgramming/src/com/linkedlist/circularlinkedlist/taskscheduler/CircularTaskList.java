package com.linkedlist.circularlinkedlist.taskscheduler;

public class CircularTaskList {
	    private TaskNode head;
	    private TaskNode tail;
	    private TaskNode current; // for scheduler (current task)

	    /* ---------------- ADD OPERATIONS ---------------- */

	    // Add at beginning O(1)
	    public void addAtBeginning(int id, String name, int priority, String date) {
	        TaskNode newNode = new TaskNode(id, name, priority, date);

	        if (head == null) {
	            head = tail = current = newNode;
	            newNode.next = newNode; // circular link
	            return;
	        }

	        newNode.next = head;
	        tail.next = newNode;
	        head = newNode;
	    }

	    // Add at end O(1)
	    public void addAtEnd(int id, String name, int priority, String date) {
	        TaskNode newNode = new TaskNode(id, name, priority, date);

	        if (head == null) {
	            head = tail = current = newNode;
	            newNode.next = newNode;
	            return;
	        }

	        tail.next = newNode;
	        newNode.next = head;
	        tail = newNode;
	    }

	    // Add at specific position (1-based)
	    public void addAtPosition(int pos, int id, String name, int priority, String date) {
	        if (pos <= 0) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (pos == 1) {
	            addAtBeginning(id, name, priority, date);
	            return;
	        }

	        TaskNode temp = head;
	        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
	            temp = temp.next;
	        }

	        TaskNode newNode = new TaskNode(id, name, priority, date);
	        newNode.next = temp.next;
	        temp.next = newNode;

	        if (temp == tail) {
	            tail = newNode;
	        }
	    }

	    /* ---------------- DELETE ---------------- */

	    public void removeByTaskId(int id) {
	        if (head == null) {
	            System.out.println("Task list is empty");
	            return;
	        }

	        // single node
	        if (head == tail && head.taskId == id) {
	            head = tail = current = null;
	            return;
	        }

	        // delete head
	        if (head.taskId == id) {
	            head = head.next;
	            tail.next = head;
	            if (current.taskId == id)
	                current = head;
	            return;
	        }

	        TaskNode temp = head;
	        while (temp.next != head && temp.next.taskId != id) {
	            temp = temp.next;
	        }

	        if (temp.next == head) {
	            System.out.println("Task not found");
	            return;
	        }

	        if (temp.next == tail) {
	            tail = temp;
	        }

	        if (current.taskId == id)
	            current = current.next;

	        temp.next = temp.next.next;
	    }

	    /* ---------------- SCHEDULER ---------------- */

	    public void viewCurrentAndMoveNext() {
	        if (current == null) {
	            System.out.println("No tasks available");
	            return;
	        }

	        displayTask(current);
	        current = current.next; // circular move
	    }

	    /* ---------------- SEARCH ---------------- */

	    public void searchByPriority(int priority) {
	        if (head == null) {
	            System.out.println("No tasks available");
	            return;
	        }

	        TaskNode temp = head;
	        boolean found = false;

	        do {
	            if (temp.priority == priority) {
	                displayTask(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found)
	            System.out.println("No task found with this priority");
	    }

	    /* ---------------- DISPLAY ---------------- */

	    public void displayAll() {
	        if (head == null) {
	            System.out.println("No tasks available");
	            return;
	        }

	        TaskNode temp = head;
	        do {
	            displayTask(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    /* ---------------- HELPER ---------------- */

	    private void displayTask(TaskNode t) {
	        System.out.println(
	            "ID: " + t.taskId +
	            ", Name: " + t.taskName +
	            ", Priority: " + t.priority +
	            ", Due Date: " + t.dueDate
	        );
	    }
}
