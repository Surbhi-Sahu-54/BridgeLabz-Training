/*
FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */

package sorting.vehiclemaintenancescheduler;
import java.util.*;

class Vehicle {
   String vehicleId;
   int mileage;

      Vehicle(String vehicleId, int mileage) {
	      this.vehicleId = vehicleId;
	      this.mileage = mileage;
	    }
	}

public class FleetManager {
	    ArrayList<Vehicle> vehicles = new ArrayList<>();

	    void addVehicle(String id, int mileage) {
	        vehicles.add(new Vehicle(id, mileage));
	        System.out.println("Vehicle added.");
	    }

	    void sortByMileage() {
	        if (vehicles.size() <= 1) {
	            System.out.println("Not enough vehicles to sort.");
	            return;
	        }
	        vehicles = mergeSort(vehicles);
	        System.out.println("Maintenance schedule sorted using Merge Sort.");
	    }

	    ArrayList<Vehicle> mergeSort(ArrayList<Vehicle> list) {
	        if (list.size() <= 1) return list;

	        int mid = list.size() / 2;
	        ArrayList<Vehicle> left = new ArrayList<>(list.subList(0, mid));
	        ArrayList<Vehicle> right = new ArrayList<>(list.subList(mid, list.size()));

	        left = mergeSort(left);
	        right = mergeSort(right);

	        return merge(left, right);
	    }

	    ArrayList<Vehicle> merge(ArrayList<Vehicle> left, ArrayList<Vehicle> right) {
	        ArrayList<Vehicle> merged = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).mileage <= right.get(j).mileage) {
	                merged.add(left.get(i));
	                i++;
	            } else {
	                merged.add(right.get(j));
	                j++;
	            }
	        }

	        while (i < left.size()) {
	            merged.add(left.get(i));
	            i++;
	        }

	        while (j < right.size()) {
	            merged.add(right.get(j));
	            j++;
	        }

	        return merged;
	    }

	    void displaySchedule() {
	        if (vehicles.size() == 0) {
	            System.out.println("No vehicle records available.");
	            return;
	        }

	        System.out.println("Vehicle Maintenance Schedule (Low to High Mileage):");
	        for (Vehicle v : vehicles) {
	            System.out.println(v.mileage + " - " + v.vehicleId);
	        }
	    }
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     FleetManager fm = new FleetManager();

	        while (true) {
	            System.out.println("\n1. Add Vehicle");
	            System.out.println("2. Sort Schedule (Merge Sort)");
	            System.out.println("3. Display Maintenance Schedule");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter Vehicle ID: ");
	                String id = sc.nextLine();

	                System.out.print("Enter Mileage: ");
	                int mileage = sc.nextInt();

	                fm.addVehicle(id, mileage);

	            } else if (ch == 2) {
	                fm.sortByMileage();

	            } else if (ch == 3) {
	                fm.displaySchedule();

	            } else if (ch == 4) {
	                System.out.println("Exit");
	                break;

	            } else {
	                System.out.println("Invalid choice");
	            }
	        }
	    }
}
