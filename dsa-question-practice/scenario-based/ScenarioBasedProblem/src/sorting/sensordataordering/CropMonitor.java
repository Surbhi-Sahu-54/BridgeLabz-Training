/*
CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestampspackage sorting.sensordataordering;
 */
package sorting.sensordataordering;
import java.util.Arrays;
import java.util.Scanner;

public class CropMonitor {
	public static void quickSort(double[] data, int start, int end) {

			if (start >= end) {
				return;
			}

			int pivotIndex = findPivotPosition(data, start, end);

			// Sort left side
			quickSort(data, start, pivotIndex - 1);

			// Sort right side
			quickSort(data, pivotIndex + 1, end);
		}

		// Partition logic
		private static int findPivotPosition(double[] data, int start, int end) {

			double pivot = data[end];
			int i = start - 1;

			for (int j = start; j < end; j++) {
				if (data[j] <= pivot) {
					i++;

					// swap data[i] and data[j]
					double temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}

			// place pivot at correct position
			double temp = data[i + 1];
			data[i + 1] = data[end];
			data[end] = temp;

			return i + 1;
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of temperature readings: ");
			int n = sc.nextInt();

			double[] temperatureData = new double[n];

			System.out.println("Enter temperature values:");
			for (int i = 0; i < n; i++) {
				temperatureData[i] = sc.nextDouble();
			}

			quickSort(temperatureData, 0, temperatureData.length - 1);

			System.out.println("Sorted Temperature Data (Ascending Order):");
			System.out.println(Arrays.toString(temperatureData));

			sc.close();
		}
}
