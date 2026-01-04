package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
	    private StudentNode head;

	    // Add at beginning (O(1))
	    public void addAtBeginning(int rollNo, String name, int age, char grade) {
	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Add at end (O(n))
	    public void addAtEnd(int rollNo, String name, int age, char grade) {
	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        StudentNode temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Add at specific position (1-based index)
	    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
	        if (position <= 0) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (position == 1) {
	            addAtBeginning(rollNo, name, age, grade);
	            return;
	        }

	        StudentNode temp = head;
	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range");
	            return;
	        }

	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // Delete by Roll Number
	    public void deleteByRollNo(int rollNo) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        if (head.rollNo == rollNo) {
	            head = head.next;
	            return;
	        }

	        StudentNode temp = head;
	        while (temp.next != null && temp.next.rollNo != rollNo) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Student not found");
	            return;
	        }

	        temp.next = temp.next.next;
	    }

	    // Search student by Roll Number
	    public void searchStudent(int rollNo) {
	        StudentNode temp = head;

	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                System.out.println("Student Found:");
	                displayStudent(temp);
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Student not found");
	    }

	    // Update grade by Roll Number
	    public void updateGrade(int rollNo, char newGrade) {
	        StudentNode temp = head;

	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                temp.grade = newGrade;
	                System.out.println("Grade updated successfully");
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Student not found");
	    }

	    // Display all students
	    public void displayAll() {
	        if (head == null) {
	            System.out.println("No student records available");
	            return;
	        }

	        StudentNode temp = head;
	        while (temp != null) {
	            displayStudent(temp);
	            temp = temp.next;
	        }
	    }

	    // Helper method (modular & reusable)
	    private void displayStudent(StudentNode s) {
	        System.out.println(
	            "Roll No: " + s.rollNo +
	            ", Name: " + s.name +
	            ", Age: " + s.age +
	            ", Grade: " + s.grade
	        );
	    }
}
