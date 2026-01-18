package sorting.sortartistsbyregistrationtime;

public class Artist {
	String artistId;
		String regTime;

		Artist(String artistId, String regTime) {
			this.artistId = artistId;
			this.regTime = regTime;
		}

		void display() {
			System.out.println("ID: " + artistId + " | Time: " + regTime);
		}
}
