package sorting.movietime;
import java.util.*;

class Show {
    String movieName;
    String time;

    Show(String movieName, String time) {
        this.movieName = movieName;
        this.time = time;
    }
}

class TheaterShowListings {
    ArrayList<Show> shows = new ArrayList<>();

    void addShow(String movieName, String time) {
        shows.add(new Show(movieName, time));
        insertionSort();
        System.out.println("Show added and sorted.");
    }

    void insertionSort() {
        for (int i = 1; i < shows.size(); i++) {
            Show key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && convertToMinutes(shows.get(j).time) > convertToMinutes(key.time)) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hr = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hr * 60 + min;
    }

    void displayShows() {
        if (shows.size() == 0) {
            System.out.println("No shows available.");
            return;
        }

        System.out.println("Upcoming Show Listings (Sorted by Time):");
        for (Show s : shows) {
            System.out.println(s.time + " - " + s.movieName);
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TheaterShowListings tsl = new TheaterShowListings();

        while (true) {
            System.out.println("\n1. Add New Show");
            System.out.println("2. Display All Shows");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Movie Name: ");
                String movie = sc.nextLine();

                System.out.print("Enter Show Time (HH:MM): ");
                String time = sc.nextLine();

                tsl.addShow(movie, time);

            } else if (ch == 2) {
                tsl.displayShows();

            } else if (ch == 3) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
