/*
 SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title
 */

package sorting.realtimebookarrangements;
import java.util.Arrays;
import java.util.Scanner;

public class SmartShelf {
         // Sort array of book titles in alphabetical order
	    public static void insertionSort(String[] books) {

	        for (int i = 1; i < books.length; i++) {
	            String currentBook = books[i];
	            int j = i - 1;

	            // Shift elements that are greater than currentBook
	            while (j >= 0 && books[j].compareToIgnoreCase(currentBook) > 0) {
	                books[j + 1] = books[j];
	                j--;
	            }

	            books[j + 1] = currentBook;
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter how many books you want to add: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume extra newline

	        String[] shelf = new String[n];

	        System.out.println("\nSmartShelf - Add Book Titles");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter book title " + (i + 1) + ": ");
	            shelf[i] = sc.nextLine();
	        }

	        insertionSort(shelf);

	        System.out.println("\nAlphabetical Reading List:");
	        System.out.println(Arrays.toString(shelf));

	        sc.close();
	    }
}
