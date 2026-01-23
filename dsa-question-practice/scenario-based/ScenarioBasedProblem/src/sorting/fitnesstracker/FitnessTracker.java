/*
FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */

package sorting.fitnesstracker;
import java.util.*;

class UserSteps {
    String userName;
    int steps;

    UserSteps(String userName, int steps) {
        this.userName = userName;
        this.steps = steps;
    }
}

class FitnessTracker {
    ArrayList<UserSteps> users = new ArrayList<>();

    void addUserSteps(String name, int steps) {
        users.add(new UserSteps(name, steps));
        System.out.println("User step data added.");
    }

    void bubbleSortLeaderboard() {
        if (users.size() <= 1) {
            System.out.println("Not enough users to sort.");
            return;
        }

        for (int i = 0; i < users.size() - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < users.size() - 1 - i; j++) {
                if (users.get(j).steps < users.get(j + 1).steps) {
                    UserSteps temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Leaderboard sorted using Bubble Sort.");
    }

    void displayLeaderboard() {
        if (users.size() == 0) {
            System.out.println("No user step data available.");
            return;
        }

        System.out.println("Daily Step Leaderboard (High to Low):");
        for (int i = 0; i < users.size(); i++) {
            UserSteps u = users.get(i);
            System.out.println((i + 1) + ". " + u.userName + " - " + u.steps + " steps");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessTracker ft = new FitnessTracker();

        while (true) {
            System.out.println("\n1. Add User Steps");
            System.out.println("2. Sort Leaderboard (Bubble Sort)");
            System.out.println("3. Display Leaderboard");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter User Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Steps: ");
                int steps = sc.nextInt();

                ft.addUserSteps(name, steps);

            } else if (ch == 2) {
                ft.bubbleSortLeaderboard();

            } else if (ch == 3) {
                ft.displayLeaderboard();

            } else if (ch == 4) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
