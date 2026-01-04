package com.linkedlist.singlylinkedlist.studentrecordmanagement;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        StudentLinkedList list = new StudentLinkedList();
	        int choice;

	        do {
	            System.out.println("\n===== Student Record Management =====");
	            System.out.println("1. Add Student at Beginning");
	            System.out.println("2. Add Student at End");
	            System.out.println("3. Add Student at Position");
	            System.out.println("4. Delete Student by Roll Number");
	            System.out.println("5. Search Student by Roll Number");
	            System.out.println("6. Update Student Grade");
	            System.out.println("7. Display All Students");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent(sc, list, 1);
	                    break;

	                case 2:
	                    addStudent(sc, list, 2);
	                    break;

	                case 3:
	                    addStudent(sc, list, 3);
	                    break;

	                case 4:
	                    System.out.print("Enter Roll Number to delete: ");
	                    list.deleteByRollNo(sc.nextInt());
	                    break;

	                case 5:
	                    System.out.print("Enter Roll Number to search: ");
	                    list.searchStudent(sc.nextInt());
	                    break;

	                case 6:
	                    System.out.print("Enter Roll Number: ");
	                    int roll = sc.nextInt();
	                    System.out.print("Enter new Grade: ");
	                    char grade = sc.next().charAt(0);
	                    list.updateGrade(roll, grade);
	                    break;

	                case 7:
	                    list.displayAll();
	                    break;

	                case 0:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (choice != 0);

	        sc.close();
	    }

	    // Helper method for input (modular code)
	    private static void addStudent(Scanner sc, StudentLinkedList list, int type) {
	        System.out.print("Enter Roll Number: ");
	        int rollNo = sc.nextInt();
	        sc.nextLine(); // clear buffer

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter Grade: ");
	        char grade = sc.next().charAt(0);

	        if (type == 1) {
	            list.addAtBeginning(rollNo, name, age, grade);
	        } else if (type == 2) {
	            list.addAtEnd(rollNo, name, age, grade);
	        } else {
	            System.out.print("Enter Position: ");
	            int pos = sc.nextInt();
	            list.addAtPosition(pos, rollNo, name, age, grade);
	        }
	    }
	}
