package sorting.sortartistsbyregistrationtime;

public class ArtistInsertionSort {
	public void sortByTime(Artist[] artists) {

			for (int i = 1; i < artists.length; i++) {

				Artist currentArtist = artists[i];
				int j = i - 1;

				// shifting artists with greater time to one step ahead
				while (j >= 0 && artists[j].regTime.compareTo(currentArtist.regTime) > 0) {
					artists[j + 1] = artists[j];
					j--;
				}

				artists[j + 1] = currentArtist;
			}
		}

}
