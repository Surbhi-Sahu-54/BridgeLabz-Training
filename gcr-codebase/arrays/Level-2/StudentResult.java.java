import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // 2D array: [][0] = Physics, [][1] = Chemistry, [][2] = Maths
        double[][] marks = new double[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // input marks 
        for (int i = 0; i < n; i++) {
          System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
              while (true) {
              if (j == 0)
              System.out.print("Physics: ");
              else if (j == 1)
              System.out.print("Chemistry: ");
              else
              System.out.print("Maths: ");

              marks[i][j] = input.nextDouble();

              if (marks[i][j] >= 0 && marks[i][j] <= 100)
                 break;
                System.out.println("Invalid marks! Enter between 0 and 100.");
                }
            }
        }
             for (int i = 0; i < n; i++) {
             double total = marks[i][0] + marks[i][1] + marks[i][2];
             percentage[i] = (total / 300) * 100;

             if (percentage[i] >= 90)
                grade[i] = 'A';
             else if (percentage[i] >= 75)
                grade[i] = 'B';
             else if (percentage[i] >= 60)
                grade[i] = 'C';
             else if (percentage[i] >= 40)
                grade[i] = 'D';
             else
                grade[i] = 'F';
           }
          for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade     : " + grade[i]);
           }

        input.close();
    }
}
