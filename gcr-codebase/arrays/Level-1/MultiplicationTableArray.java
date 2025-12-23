
import java.util.Scanner;

public class MultiplicationTableArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
 
        int[] result = new int[4];
        int index =0;
        for (int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }
         System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
       
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }
         input.close();
    }
}
