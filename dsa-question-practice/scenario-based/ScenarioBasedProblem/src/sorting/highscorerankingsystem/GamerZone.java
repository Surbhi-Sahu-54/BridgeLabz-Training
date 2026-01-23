package sorting.highscorerankingsystem;
	import java.util.*;

class Player {
	String name;
	int score;

    Player(String name, int score) {
	   this.name = name;
	   this.score = score;
	 }
	}

public class GamerZone {
	    ArrayList<Player> players = new ArrayList<>();

	    void addPlayer(String name, int score) {
	        players.add(new Player(name, score));
	        System.out.println("Player added.");
	    }

	    void quickSortLeaderboard() {
	        if (players.size() <= 1) {
	            System.out.println("Not enough players to sort.");
	            return;
	        }
	        quickSort(0, players.size() - 1);
	        System.out.println("Leaderboard sorted using Quick Sort.");
	    }

	    void quickSort(int low, int high) {
	        if (low < high) {
	            int p = partition(low, high);
	            quickSort(low, p - 1);
	            quickSort(p + 1, high);
	        }
	    }

	    int partition(int low, int high) {
	        int pivot = players.get(high).score;
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (players.get(j).score > pivot) {
	                i++;
	                Player temp = players.get(i);
	                players.set(i, players.get(j));
	                players.set(j, temp);
	            }
	        }

	        Player temp = players.get(i + 1);
	        players.set(i + 1, players.get(high));
	        players.set(high, temp);

	        return i + 1;
	    }

	    void displayLeaderboard() {
	        if (players.size() == 0) {
	            System.out.println("No players available.");
	            return;
	        }

	        System.out.println("Leaderboard (High to Low):");
	        for (int i = 0; i < players.size(); i++) {
	            Player p = players.get(i);
	            System.out.println((i + 1) + ". " + p.name + " - " + p.score);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        GamerZone gz = new GamerZone();

	        while (true) {
	            System.out.println("\n1. Add Player Score");
	            System.out.println("2. Sort Leaderboard (Quick Sort)");
	            System.out.println("3. Display Leaderboard");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter Player Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Score: ");
	                int score = sc.nextInt();

	                gz.addPlayer(name, score);

	            } else if (ch == 2) {
	                gz.quickSortLeaderboard();

	            } else if (ch == 3) {
	                gz.displayLeaderboard();

	            } else if (ch == 4) {
	                System.out.println("Exit");
	                break;

	            } else {
	                System.out.println("Invalid choice");
	            }
	        }
	    }

}
