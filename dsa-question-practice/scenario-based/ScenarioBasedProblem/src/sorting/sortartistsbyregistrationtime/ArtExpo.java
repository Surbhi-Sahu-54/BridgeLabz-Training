/*
 *ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
 */

package sorting.sortartistsbyregistrationtime;
import java.util.Scanner;

public class ArtExpo {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of artists: ");
			int n = sc.nextInt();

			Artist[] artistList = new Artist[n];

			System.out.println("\nEnter Artist Details (ID and Time in hh:mm format)");

			for (int i = 0; i < artistList.length; i++) {
				System.out.println("\nArtist " + (i + 1));

				System.out.print("Enter Artist ID: ");
				String id = sc.next();

				System.out.print("Enter Registration Time (hh:mm): ");
				String time = sc.next();

				artistList[i] = new Artist(id, time);
			}

			ArtistInsertionSort sorter = new ArtistInsertionSort();
			sorter.sortByTime(artistList);

			System.out.println("\nSorted Artists List (By Registration Time):");
			for (int i = 0; i < artistList.length; i++) {
				artistList[i].display();
			}

			sc.close();
		}
}
