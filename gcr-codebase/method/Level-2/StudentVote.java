import java.util.Scanner;

public class StudentVote {

    // method 
    public boolean canStudentVote(int age) {

       
        if (age < 0) {
            return false;
        }

        // check if age is 18 or above
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create object of class
        StudentVoteChecker checker = new StudentVoteChecker();

        // array to store ages of 10 students
        int[] ages = new int[10];

        // loop to take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            System.out.println("Enter age of student " + (i + 1) + ":");
            ages[i] = input.nextInt();

            // call method
            boolean result = checker.canStudentVote(ages[i]);

            // display result
            if (result) {
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }
}
