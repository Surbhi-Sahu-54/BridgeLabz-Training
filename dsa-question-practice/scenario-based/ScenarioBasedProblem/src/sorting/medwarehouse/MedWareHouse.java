package sorting.medwarehouse;
import java.util.*;

class Medicine {
    String medName;
    String expiryDate;   // format: DD-MM-YYYY

    Medicine(String medName, String expiryDate) {
        this.medName = medName;
        this.expiryDate = expiryDate;
    }
}

public class MedWareHouse {
    ArrayList<Medicine> medicines = new ArrayList<>();

    void addMedicine(String name, String expiryDate) {
        medicines.add(new Medicine(name, expiryDate));
        System.out.println("Medicine added.");
    }

    void sortByExpiry() {
        if (medicines.size() <= 1) {
            System.out.println("Not enough medicines to sort.");
            return;
        }
        medicines = mergeSort(medicines);
        System.out.println("Medicines sorted by expiry date using Merge Sort.");
    }

    ArrayList<Medicine> mergeSort(ArrayList<Medicine> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        ArrayList<Medicine> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Medicine> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    ArrayList<Medicine> merge(ArrayList<Medicine> left, ArrayList<Medicine> right) {
        ArrayList<Medicine> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (convertToNumber(left.get(i).expiryDate) <= convertToNumber(right.get(j).expiryDate)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    int convertToNumber(String date) {
        String[] parts = date.split("-");
        int dd = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int yy = Integer.parseInt(parts[2]);
        return yy * 10000 + mm * 100 + dd;
    }

    void displayMedicines() {
        if (medicines.size() == 0) {
            System.out.println("No medicine records available.");
            return;
        }

        System.out.println("Medicine List (Sorted by Expiry Date):");
        for (int i = 0; i < medicines.size(); i++) {
            Medicine m = medicines.get(i);
            System.out.println((i + 1) + ". " + m.medName + " - " + m.expiryDate);
        }
    }

    void alertNearExpiry(String todayDate, int daysLimit) {
        if (medicines.size() == 0) {
            System.out.println("No medicine records available.");
            return;
        }

        int today = convertToNumber(todayDate);
        System.out.println("Medicines Near Expiry (Within " + daysLimit + " days):");

        boolean found = false;
        for (Medicine m : medicines) {
            int exp = convertToNumber(m.expiryDate);
            int diff = exp - today;

            if (diff >= 0 && diff <= daysLimit) {
                System.out.println(m.medName + " - " + m.expiryDate);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No medicines nearing expiry.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedWareHouse mw = new MedWareHouse();

        while (true) {
            System.out.println("\n1. Add Medicine");
            System.out.println("2. Sort Medicines by Expiry (Merge Sort)");
            System.out.println("3. Display Medicines");
            System.out.println("4. Alert Near Expiry");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Medicine Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Expiry Date (DD-MM-YYYY): ");
                String date = sc.nextLine();

                mw.addMedicine(name, date);

            } else if (ch == 2) {
                mw.sortByExpiry();

            } else if (ch == 3) {
                mw.displayMedicines();

            } else if (ch == 4) {
                System.out.print("Enter Today's Date (DD-MM-YYYY): ");
                String today = sc.nextLine();

                System.out.print("Enter Days Limit: ");
                int limit = sc.nextInt();

                mw.alertNearExpiry(today, limit);

            } else if (ch == 5) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
