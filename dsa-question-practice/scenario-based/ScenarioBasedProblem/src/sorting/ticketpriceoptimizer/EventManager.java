package sorting.ticketpriceoptimizer;
import java.util.Arrays;

public class EventManager {
		public static void quickSort(double[] arr, int start, int end) {

			if (start >= end) {
				return;
			}

			int pivotIndex = getPivotIndex(arr, start, end);

			// Left side sort
			quickSort(arr, start, pivotIndex - 1);

			// Right side sort
			quickSort(arr, pivotIndex + 1, end);
		}

		// Partition method: places pivot in correct position
		private static int getPivotIndex(double[] arr, int start, int end) {

			double pivot = arr[end];
			int i = start - 1;

			for (int j = start; j < end; j++) {
				if (arr[j] <= pivot) {
					i++;

					// Swap arr[i] and arr[j]
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			// Swap pivot to its correct position
			double temp = arr[i + 1];
			arr[i + 1] = arr[end];
			arr[end] = temp;

			return i + 1;
		}

		public static void main(String[] args) {

			double[] ticketPrices = { 1200.50, 450.00, 890.00, 150.75, 3200.00, 110.00 };

			System.out.println("Before Sorting: " + Arrays.toString(ticketPrices));

			quickSort(ticketPrices, 0, ticketPrices.length - 1);

			System.out.println("After Sorting (Low to High): " + Arrays.toString(ticketPrices));
		}
	}
