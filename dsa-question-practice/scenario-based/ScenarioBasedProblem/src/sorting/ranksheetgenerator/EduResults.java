/*
EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting

 */

package sorting.ranksheetgenerator;
import java.util.*;

class StudentResult {
    String name;
    int marks;

    StudentResult(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class EduResults {
    ArrayList<StudentResult> students = new ArrayList<>();

    void addStudent(String name, int marks) {
        students.add(new StudentResult(name, marks));
        System.out.println("Student added.");
    }

    void sortRankList() {
        if (students.size() <= 1) {
            System.out.println("Not enough data to sort.");
            return;
        }
        students = mergeSort(students);
        System.out.println("Rank list generated using Merge Sort.");
    }

    ArrayList<StudentResult> mergeSort(ArrayList<StudentResult> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        ArrayList<StudentResult> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<StudentResult> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    ArrayList<StudentResult> merge(ArrayList<StudentResult> left, ArrayList<StudentResult> right) {
        ArrayList<StudentResult> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).marks >= right.get(j).marks) {
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

    void displayRankList() {
        if (students.size() == 0) {
            System.out.println("No student data available.");
            return;
        }

        System.out.println("Final Rank List (High to Low Marks):");
        for (int i = 0; i < students.size(); i++) {
            StudentResult s = students.get(i);
            System.out.println((i + 1) + ". " + s.name + " - " + s.marks);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EduResults er = new EduResults();

        while (true) {
            System.out.println("\n1. Add Student Marks");
            System.out.println("2. Generate Rank List (Merge Sort)");
            System.out.println("3. Display Rank List");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                er.addStudent(name, marks);

            } else if (ch == 2) {
                er.sortRankList();

            } else if (ch == 3) {
                er.displayRankList();

            } else if (ch == 4) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
