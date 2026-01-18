/*
 RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 */

package sorting.shelfloadingrobot;
import java.util.Arrays;
import java.util.Scanner;

public class RoboWareHouse {
   // Insertion Sort for package weights
		public static void insertionSort(int[] weights) {

			for (int i = 1; i < weights.length; i++) {

				int currentWeight = weights[i];
				int j = i - 1;

				// Shift bigger weights one step ahead
				while (j >= 0 && weights[j] > currentWeight) {
					weights[j + 1] = weights[j];
					j--;
				}

				weights[j + 1] = currentWeight;
			}
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of packages: ");
			int n = sc.nextInt();

			int[] packageWeights = new int[n];

			System.out.println("Enter package weights:");
			for (int i = 0; i < packageWeights.length; i++) {
				packageWeights[i] = sc.nextInt();
			}

			insertionSort(packageWeights);

			System.out.println("Packages arranged on shelves (Ascending Order):");
			System.out.println(Arrays.toString(packageWeights));

			sc.close();
		}

}
