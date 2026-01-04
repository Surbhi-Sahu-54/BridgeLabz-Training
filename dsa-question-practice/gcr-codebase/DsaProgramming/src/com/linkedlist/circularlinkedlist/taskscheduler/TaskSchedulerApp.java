package com.linkedlist.circularlinkedlist.taskscheduler;
import java.util.Scanner;
public class TaskSchedulerApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        CircularTaskList tasks = new CircularTaskList();
	        int choice;

	        do {
	            System.out.println("\n===== Task Scheduler =====");
	            System.out.println("1. Add Task at Beginning");
	            System.out.println("2. Add Task at End");
	            System.out.println("3. Add Task at Position");
	            System.out.println("4. Remove Task by ID");
	            System.out.println("5. View Current Task & Move Next");
	            System.out.println("6. Display All Tasks");
	            System.out.println("7. Search Task by Priority");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1, 2, 3 -> addTask(sc, tasks, choice);
	                case 4 -> {
	                    System.out.print("Enter Task ID: ");
	                    tasks.removeByTaskId(sc.nextInt());
	                }
	                case 5 -> tasks.viewCurrentAndMoveNext();
	                case 6 -> tasks.displayAll();
	                case 7 -> {
	                    System.out.print("Enter Priority: ");
	                    tasks.searchByPriority(sc.nextInt());
	                }
	                case 0 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice");
	            }

	        } while (choice != 0);

	        sc.close();
	    }

	    private static void addTask(Scanner sc, CircularTaskList list, int type) {
	        System.out.print("Task ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Task Name: ");
	        String name = sc.nextLine();

	        System.out.print("Priority: ");
	        int priority = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Due Date: ");
	        String date = sc.nextLine();

	        if (type == 1)
	            list.addAtBeginning(id, name, priority, date);
	        else if (type == 2)
	            list.addAtEnd(id, name, priority, date);
	        else {
	            System.out.print("Position: ");
	            list.addAtPosition(sc.nextInt(), id, name, priority, date);
	        }
	    }
}
