package sorting.foodfest;
import java.util.*;
	
class Stall {
	    String stallName;
	    int footfall;

	    Stall(String stallName, int footfall) {
	        this.stallName = stallName;
	        this.footfall = footfall;
	    }
	}

public class CustomerFootfall {
	    ArrayList<Stall> stalls = new ArrayList<>();

	    void addStall(String name, int footfall) {
	        stalls.add(new Stall(name, footfall));
	    }

	    void sortByFootfall() {
	        if (stalls.size() <= 1) {
	            System.out.println("Not enough data to sort.");
	            return;
	        }
	        stalls = mergeSort(stalls);
	        System.out.println("Sorted by footfall using Merge Sort.");
	    }

	    ArrayList<Stall> mergeSort(ArrayList<Stall> list) {
	        if (list.size() <= 1) return list;

	        int mid = list.size() / 2;
	        ArrayList<Stall> left = new ArrayList<>(list.subList(0, mid));
	        ArrayList<Stall> right = new ArrayList<>(list.subList(mid, list.size()));

	        left = mergeSort(left);
	        right = mergeSort(right);

	        return merge(left, right);
	    }

	    ArrayList<Stall> merge(ArrayList<Stall> left, ArrayList<Stall> right) {
	        ArrayList<Stall> merged = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).footfall <= right.get(j).footfall) {
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

	    void displayStalls() {
	        if (stalls.size() == 0) {
	            System.out.println("No stall data available.");
	            return;
	        }

	        System.out.println("Stalls List (Sorted by Footfall):");
	        for (Stall s : stalls) {
	            System.out.println(s.footfall + " - " + s.stallName);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        CustomerFootfall fest = new CustomerFootfall();

	        while (true) {
	            System.out.println("\n1. Add Stall Data");
	            System.out.println("2. Sort by Footfall (Merge Sort)");
	            System.out.println("3. Display Stalls");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter Stall Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Footfall Count: ");
	                int footfall = sc.nextInt();

	                fest.addStall(name, footfall);
	                System.out.println("Stall data added.");

	            } else if (ch == 2) {
	                fest.sortByFootfall();

	            } else if (ch == 3) {
	                fest.displayStalls();

	            } else if (ch == 4) {
	                System.out.println("Exit");
	                break;

	            } else {
	                System.out.println("Invalid choice");
	            }
	        }
	    }
}
