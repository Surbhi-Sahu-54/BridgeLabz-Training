/*
ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)
 */


package sorting.dailysalessummaryreport;
import java.util.Arrays;


public class ZipZipMart {
		public static void mergeSort(double[] arr, int start, int end) {

			if (start >= end) {
				return;
			}

			int mid = start + (end - start) / 2;

			// Sort left part
			mergeSort(arr, start, mid);

			// Sort right part
			mergeSort(arr, mid + 1, end);

			// Merge both sorted parts
			mergeParts(arr, start, mid, end);
		}

		// Merge two sorted halves
		public static void mergeParts(double[] arr, int start, int mid, int end) {

			int leftSize = mid - start + 1;
			int rightSize = end - mid;

			double[] leftArr = new double[leftSize];
			double[] rightArr = new double[rightSize];

			// Copy elements into left array
			for (int i = 0; i < leftSize; i++) {
				leftArr[i] = arr[start + i];
			}

			// Copy elements into right array
			for (int j = 0; j < rightSize; j++) {
				rightArr[j] = arr[mid + 1 + j];
			}

			int i = 0;       // index for leftArr
			int j = 0;       // index for rightArr
			int k = start;   // index for original array

			// Merge both arrays in sorted order
			while (i < leftSize && j < rightSize) {
				if (leftArr[i] <= rightArr[j]) {
					arr[k] = leftArr[i];
					i++;
				} else {
					arr[k] = rightArr[j];
					j++;
				}
				k++;
			}

			// Copy remaining elements of leftArr
			while (i < leftSize) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}

			// Copy remaining elements of rightArr
			while (j < rightSize) {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}

		public static void main(String[] args) {

			double[] sales = { 450.50, 120.00, 1200.75, 450.50, 89.99, 500.00 };

			System.out.println("Original Sales Records: " + Arrays.toString(sales));

			mergeSort(sales, 0, sales.length - 1);

			System.out.println("Sorted Sales Report: " + Arrays.toString(sales));
		}
}
